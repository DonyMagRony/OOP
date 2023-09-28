 package practice2;

class Time{
	private int hour;
    private int minute;
    private int second;

    public Time(int hour, int minute, int second) {
        setTime(hour, minute, second);
    }

    public void setTime(int hour, int minute, int second) {
        if (hour < 0 || hour >= 24 || minute < 0 || minute >= 60 || second < 0 || second >= 60) {
            System.out.println("Invalid time format");
            return;
        }
        this.hour = hour;
        this.minute = minute;
        this.second = second;
    }

    public String toUniversal() {
        return String.format("%02d:%02d:%02d", hour, minute, second);
    }

    public String toStandard() {
    	String amPm;
    	int standardHour;
    	if(hour<12) {
    		amPm="AM";
    	}else {
    		amPm="PM";
    	}
    	if (hour == 0 || hour == 12) {
    	    standardHour = 12;
    	} else {
    	    standardHour = hour % 12;
    	}
        return String.format("%02d:%02d:%02d %s", standardHour, minute, second, amPm);
    }

    public String add(Time other) {
        int newSecond = this.second + other.second;
        int reSecond = newSecond / 60;
        this.second = newSecond % 60;

        int newMinute = this.minute + other.minute + reSecond;
        int reMinute = newMinute / 60;
        this.minute = newMinute % 60;

        int newHour = this.hour + other.hour + reMinute;
        this.hour = newHour % 24;
        return String.format("%02d:%02d:%02d", hour, minute, second);
    }
}