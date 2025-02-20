class TestFinal{
	public static void main(String[] args) {
		useFinal();

		int data = 10 ;

		MyInter inter = new MyInter(){

			public void show(){
				System.out.println("Show data "+data);
			}
		};

	}

	static void useFinal(){
		//must be final or effectively final because it is used in local class
		int data = 10 ;
		class Data{
			
			void showData(){
				System.out.println("Show data "+data);
			}
		}

		Data d = new Data();
		d.showData();
	}
}

interface MyInter{
	void show();
}