class Test03 
{
	public static void main(String[] args) 
	{
		float f1=10.5F;
		float f2=1.5F;
		int a=100;
		m1(10);
		m1((byte)10);
		m1((short)10);
		m1((long)10);
		m1(10.5);
		m1(10.0F);
		m1(5);
		m1(5.6F);
		long l1 =12345L;
		System.out.println("12345L");
		long l2 =10;
		long l3 =10L;
		System.out.println("10");
		System.out.println("10L");
		System.out.println("5");
       System.out.println(1111);
	}
	static void m1(int i){
		System.out.println("int param");
        System.out.println("i");
         System.out.println("a");
	}
	static void m1(float f){
		System.out.println("float param");
        System.out.println("anumandla sreenu");
		         System.out.println("f1");
                        System.out.println("f2");
}
	static void m1(double d){
		System.out.println("double param");
}

static void m1(short s){
		System.out.println("short param");
		         System.out.println("s");

}
       static void m1(byte b){
		System.out.println("byte param");
		         System.out.println("b");

	   }
}