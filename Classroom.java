class Classroom
{
	public static void main(String[] args)
	{
		Wilder[] student = new Wilder[10];
		student[0] = new Wilder("Ben", true);
		student[1] = new Wilder("Jonas", true);
		student[2] = new Wilder("Paul", true);
		student[3] = new Wilder("Henry", true);
		student[4] = new Wilder("Finn", false);
		student[5] = new Wilder("Leon", false);
		student[6] = new Wilder("Felix", true);
		student[7] = new Wilder("Elias", false);
		student[8] = new Wilder("Luis", true);
		student[9] = new Wilder("Noah", true);
	
		for (int i = 0; i < student.length; i++)
		{
			String Text=student[i].whoAmI();
			System.out.println("  " +(i+1)+". " +Text);
		}
	}
}
/* Lösung:
  1. My name is Ben and I am present
  2. My name is Jonas and I am present
  3. My name is Paul and I am present
  4. My name is Henry and I am present
  5. My name is Finn and I am not present
  6. My name is Leon and I am not present
  7. My name is Felix and I am present
  8. My name is Elias and I am not present
  9. My name is Luis and I am present
  10. My name is Noah and I am present
*/
