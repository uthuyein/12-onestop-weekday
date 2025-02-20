class Main{
	public static void main(String[] args) {
		
		//By sub class
		Reaction emoji = new Emoji();
		emoji.setMessage("Use Emoji");
		System.out.println(emoji.getMessage());

		emoji.love();
		emoji.hate();

		Reaction avator = new Avator();
		avator.setMessage("Use Avator ");
		System.out.println(avator.getMessage());

		avator.love();
		avator.hate();

		//By Anonymous
		Reaction react = new Reaction(){
			void love(){
				System.out.println("React : I love you");
			}

			void hate(){
				System.out.println("React : I hate you !");
			}
		};
		react.setMessage("Use React ");
		System.out.println(react.getMessage());

		react.love();
		react.hate();
	}
}