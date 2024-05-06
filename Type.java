
public enum Type {
	

	    ALCOHOL,
	    COFFEE,
	    SMOOTHIE;

	    public static Type fromString(String typeString) {
	        switch (typeString.toUpperCase()) {
	            case "ALCOHOL":
	                return ALCOHOL;
	            case "COFFEE":
	                return COFFEE;
	            case "SMOOTHIE":
	                return SMOOTHIE;
	            default:
	                throw new IllegalArgumentException("Invalid beverage type: " + typeString);
	        }
	    }

	    
	}


