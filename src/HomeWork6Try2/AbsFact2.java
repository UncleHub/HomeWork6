package HomeWork6Try2;


public class AbsFact2 {

    public PlaceOfLiving getPlaceOfLiving(String place){
        if("sea".equals(place)){
            return new Sea();
        }if("land".equals(place)){
            return new Land();
        }if("air".equals(place)){
            return new Air();
        }
        throw new IllegalArgumentException("Это не место обитания, животное.");
    }

}
