package practiceTest;

		class name
		{
		private String firstname;
		private String lastname;
		public name(String firtsname, String lastname) {
		super();
		this.firstname = firtsname;
		this.lastname = lastname;
		}

		void validationmethod() throws Exception
		{

		if(firstname==null && lastname==null)
		{
		throw new Exception("entry missing");
		}
		else if (firstname.length()<3 && lastname.length()<3)
		{
		throw new Exception("there should be min 3 characters");
		}
		else
		System.out.println("firstname and lastname are :"+firstname+ " " +lastname);
		}

		}





		public class ExceptionEg {

		public static void main(String[] args) throws Exception {

		name a =new name("ak","nu");
		a.validationmethod();


		}

		

	}


