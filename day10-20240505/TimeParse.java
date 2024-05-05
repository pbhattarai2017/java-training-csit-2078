public class TimeParse {
	public static void main(String[] args) {
        String time = "07:05:45PM";
        String[] parts = time.split(":");
        
        for(int i = 0; i < parts.length; i ++) {
            System.out.println(parts[i]);
        }
        
        int hh = Integer.parseInt(parts[0]);
        int mm = Integer.parseInt(parts[1]);
        int ss = Integer.parseInt(parts[2].substring(0, 2));
        String timeOfDay = parts[2].substring(2,4);
        
        // Write your solution code here
        if(timeofDay.equals("AM")) {
            // this is AM time
            // check if hh = 12, then set hh = 0
        } else {
            // this is PM time
            // if hh < 12, then set hh = hh + 12
        }
        
        System.out.printf("%d:%d:%d\n", hh, mm, ss);
        
	}
}

