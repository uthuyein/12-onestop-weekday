package modifier_test;
import modifier_test.pkgOne.ModifierData;

public class ModifierDemo extends ModifierData{
	public static void main(String[] args) {
		ModifierData data = new ModifierData();
		//data.privateData = 10 ;
		//data.defaultData = 20 ;
		//protectedData = 30 ;
		data.publicData = 40 ;
		//data.x = 14;
		showData();
	}

	
}
