class knapsackFrac {
	static class itemValue {
		double cost;
		double wt, vl, index;

		public itemValue(int wt, int vl, int index) {
			this.wt = wt;
			this.vl = vl;
			this.index = index;
			cost = (double)((double)val/(double)wt);
		}
	}
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();

		int []weight = new int[n];
		int []values = new int[n];

		int capacity = sc.nextInt();

		double ans = fracKnap(weight, values, capacity);
		System.out.println(ans);
	}
	public static double fracKnap (int []weight, int[]values, int capacity) {
		itemValue iVal = new itemValue[weight.length];

		for(int i = 0; i < weight.lenth; i++) {
			iVal[i] = new itemValue(weight[i], value[i], i);
		}
		Arrays.sort(iVal, new Comparator<itemValue>(){
			@Override
			public int compare(itemValue o1, itemValue o2) {
				return o2.cost.compare(o1.cost);
			}
		});
		double totalValue = 0;
		for(itemValue i : iVal) {
			int currentWt = (int)i.wt;
			int currentVal = (int)i.val;

			if(capacity - currentWt >= 0) {
				capacity -= currentWt;
				totalValue += currentVal;
			} else {
				double fraction = ((double)capacity/(double)currentWt);
				totalValue += currentVal * fraction;
				capacity = (int) (capacity - (currentWt * fraction));
				break;
			}
		}
		return totalValue;
	}
}
