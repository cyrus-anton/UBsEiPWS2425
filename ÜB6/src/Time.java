public class Time {
	
    

	private int hours;
    private int minutes;
    private int seconds;

    private int validateHour(int hours) {
    	return (hours >= 0 && hours < 24 ) ? hours: 0;
    }
    
    private int validateMinute(int minutes) {
    	return (minutes >= 0 && minutes < 60 ) ? minutes: 0;
    }
    
    private int validateSeconds( int seconds) {
    	return (seconds >= 0 && seconds < 60 ) ? seconds: 0;
    }
    public Time (int hours, int minutes, int seconds) {
    	
    	this.hours = validateHour(hours);
    	this.minutes = validateMinute(minutes);
    	this.seconds = validateSeconds(seconds);
    	
    }
    
    public Time (int hours, int minutes) {
    	this(hours, minutes, 0);
    }
    
    public Time(int hours) {
    	this(hours, 0);
    }
    
    public Time() {
    	this(0);
    }
    
    public int getHours() {
		return hours;
	}

	public int getMinutes() {
		return minutes;
	}

	public int getSeconds() {
		return seconds;
	}

    public Time clone() {
        return new Time(this.hours, this.minutes, this.seconds); 
  
    }

    public boolean isEqualTo(Time other) {
        return (this.hours == other.hours && this.minutes== other.minutes &&
        		this.seconds==other.seconds);
        
        
    }

    public void add(Time other) {
       this.seconds += other.seconds;
       this.minutes += other.minutes + this.seconds / 60;
       this.hours += other.hours + this.minutes / 60;
       this.seconds = this.seconds % 60;
       this.minutes = this.minutes % 60;
       this.hours = this.hours % 24;
    }

    public void tick() {
       add(new Time(0,0,1));
    }

    
    
    
    
    
    
    
    
    public Time differenceTo(Time other) {
        int differenceSeconds;
        if (other.timeToSeconds() - timeToSeconds() > 0)
        	differenceSeconds = other.timeToSeconds() - timeToSeconds();
        else {
        	differenceSeconds = 24*60*60 - timeToSeconds() + other.timeToSeconds();
        }
        return new Time(differenceSeconds / (60*60), (differenceSeconds % (60*60)) / 60, differenceSeconds % 60);
    }
    
    
    
    
    
    
    
    
    
    public int timeToSeconds() {
    	return this.hours * 60 * 60 + minutes * 60 + seconds;
    }

    @Override
    public String toString() {
        return String.format(
                "Time(hours: %d, minutes: %d, seconds: %d)",
                hours,
                minutes,
                seconds
        );
    }
    public static void main(String[] args) {
		Time time = new Time (0,0,1);
		System.out.println(time.toString());
		time.tick();
		System.out.println(time.toString());
		
	}
}
