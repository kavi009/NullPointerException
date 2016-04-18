package session7;

public class NullPointExc {

	@SuppressWarnings("null")
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	try{
		String str=null;
		System.out.println (str.length());
	}catch(NullPointerException e){
		System.out.println("Exception.."+e);
	}

	}
}
