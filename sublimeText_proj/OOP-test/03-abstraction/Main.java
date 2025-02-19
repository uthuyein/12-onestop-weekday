class Main{
	public static void main(String[] args) {
		Reaction emoji = new emoji();
		emoji.setMessage("Use Emoji");
		System.out.println(emoji.getMessage());

		emoji.love();
		emoji.hate();

		Reaction avator = new Avator();
		avator.setMessage("Use Avator ");
		System.out.println(avator.getMessage());

		avator.love();
		avator.hate();
	}
}