
public enum Size {
	
	    LARGE,MEDIUM,SMALL;
	    
        
	    public static Size fromString(String sizeString) {
	        switch (sizeString.toUpperCase()) {
	            case "SMALL":
	                return SMALL;
	            case "MEDIUM":
	                return MEDIUM;
	            case "LARGE":
	                return LARGE;
	            default:
	                throw new IllegalArgumentException("Invalid size: " + sizeString);
	        }
	    }

	   
	}

