package test.pack;
import org.joda.time.LocalDate;

public class JodaDateTimeUtils {
	static LocalDate ld = new LocalDate();

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// Added comment for branch2
		// Added comment for branch1

		JodaDateTimeUtils jdt = new JodaDateTimeUtils();
System.out.println("Hello World!\n"+jdt.jGetYear());
	}
	public int jGetYear()
	{
		return ld.getYear();
	}
	public int jGetMonthOfYear()
	{
		return ld.getMonthOfYear();
	}
	public int jGetDateOfMonth()
	{
		//System.out.println(ld.getDayOfMonth());
		return ld.getDayOfMonth();
	}
}
