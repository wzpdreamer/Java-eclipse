import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

class Student{
	private String name;
	private String num;
	public Student(String name,String num) {
		this.name=name;
		this.num=num;
	}
	public void print() {
		System.out.println(name+num);
	}
}
public class test{
	public static void main(String[] args) {
		String[] s = {"1","2","3","4","5"};
		ArrayList<String> al = new ArrayList<>();
		for(int i = 0;i<s.length;i++){
			al.add(s[i]);
		}
		for(int i = 0;i<al.size();i++){
			System.out.println("ArrayList!" + al.get(i));
		}
		String[] a2 = new String[5];
		System.arraycopy(s, 0, a2, 0, 5);
		for(int i = 0;i< s.length;i++){
			System.out.println("copyed!" + a2[i]);
		}
		/**
         * List ��һ���ӿڣ�arrayListʵ��������ӿڣ�������˳��洢����
         * HashSet��ʵ���˽ӿ�Set��һ���࣬����ϣ�����洢���ݣ��ظ������ظ��洢���ᶪʧ����ʱ��˳��
         * HashMap��ʵ���˽ӿ�Map��һ���࣬����ֵ�Եķ�ʽ�洢������������ϣ�������д洢��
         */
		Student s1 = new Student("wzp","1707004718");
		Student s2 = new Student("zjb","1707004650");
		Student s3 = new Student("dyq","1707004717");
		Student[] arrays = {s1,s2,s3};
		List<Student> list = new ArrayList<>(Arrays.asList(s1,s2,s3));
		Set<Student> set = new HashSet<>(Arrays.asList(s1,s2,s3));
		Map<String,Student> map = new HashMap<>();
		map.put("student1", s1);
		map.put("student2", s2);
		map.put("student3", s3);
		arrays[0].print();
		arrays[1].print();
		arrays[2].print();
		list.get(0).print();
		list.get(1).print();
		list.get(2).print();
		System.out.println(set);
		System.out.println(map);
	}
}

