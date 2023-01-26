
public class PrintVisitorImplementation implements Print_Visitor {

	@Override
	public String print(Goal goal) {
		// TODO Auto-generated method stub
		System.out.println(goal.id);
		System.out.println(goal.desc);
		return null;
	}

	@Override
	public String print(Assumption assumption) {
		// TODO Auto-generated method stub
		System.out.println(assumption.id);
		System.out.println(assumption.desc);
		return null;
	}

	@Override
	public String print(Justification justification) {
		// TODO Auto-generated method stub
		System.out.println(justification.id);
		System.out.println(justification.desc);
		return null;
	}

	@Override
	public String print(Solution solution) {
		// TODO Auto-generated method stub
		System.out.println(solution.id);
		System.out.println(solution.desc);
		return null;
	}

	@Override
	public String print(Context context) {
		// TODO Auto-generated method stub
		System.out.println(context.id);
		System.out.println(context.desc);
		return null;
	}

	@Override
	public String print(Strategy strategy) {
		// TODO Auto-generated method stub
		System.out.println(strategy.id);
		System.out.println(strategy.desc);
		return null;
	}

	

}
