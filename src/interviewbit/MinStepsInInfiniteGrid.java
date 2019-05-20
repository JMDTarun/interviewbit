package interviewbit;
import java.util.ArrayList;
import java.util.List;
import static java.util.stream.Stream.of;
import static java.util.stream.Collectors.toCollection;

public class MinStepsInInfiniteGrid {
	
	public static void main(String[] args) {
		List<Integer> x = of(0,2,4,6).collect(toCollection(ArrayList::new));
		List<Integer> y = of(0,1,2,3).collect(toCollection(ArrayList::new));
		MinStepsInInfiniteGrid minSteps = new MinStepsInInfiniteGrid();
		int coverPoints = minSteps.coverPoints(x, y);
		System.out.println(coverPoints);
	}

	public int coverPoints(List<Integer> X, List<Integer> Y) {
		int s1 = X.size(), ans = 0;
		for (int i = 1; i < s1; i++) {
			ans = ans + (Math.abs(X.get(i) - X.get(i - 1)) < Math.abs(Y.get(i) - Y.get(i - 1))
					? Math.abs(Y.get(i) - Y.get(i - 1))
					: Math.abs(X.get(i) - X.get(i - 1)));
		}
		return ans;
	}

}
