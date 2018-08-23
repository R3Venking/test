
public class Singleton {
 
	public static Singleton instance = null;
	private Singleton(){}
	public static Singleton getInstance(){
		if(instance==null){
			return new Singleton();
		}
		return instance ;
	}
	
	public void show(){
		System.out.println("Singleton Mode!");
	}
        public static void main(String args[]){
            Singleton.getInstance().show();
        }
}