public class Class05 {
	static class CBox{
		 int length;
		 int width;
		 int height;
		
		 int volume(){
			 return length*width*height;
		 }
		 int surfaceArea(){
			 return 2*((length*width)+(width*height)+(length*height));
		 }
		 void showData(){
			 System.out.println("length="+length);
		 System.out.println("width="+width);
		 System.out.println("height="+height);
		 }
		 void showAll(){
			 showData();
			 System.out.println("surface area="+surfaceArea());
			 System.out.println("volume="+volume());
		 }
	}
	public static void main(String[] args) {
		 CBox box;
		 box=new CBox();
	}

}
