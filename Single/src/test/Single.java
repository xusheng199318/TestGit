package test;
/*
 * 单例模式：
 * 		懒汉 单例模式：
 * 		1.静态成员变量
 * 		2.私有化构造 方法
 * 		3.静态获取对象 方法
 * */
public class Single {

	private static Single s;
	
	private Single(){}
	
	public static Single getInstance(){
		if(s == null){
			synchronized ("锁") {
				if(s == null){
					s = new Single();
				}
			}
		}
		return s;
	}
}
