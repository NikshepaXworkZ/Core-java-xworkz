package ottplatform;

public class OttPlatform {
    String movieNames[] = new String[5];
    int index;

    public boolean addMovieName(String movieName){
        System.out.println("invoked addMovieName()");
        boolean isAdded = false;
        if(index < movieNames.length){

            if(movieName != null){
                boolean exist = checkIfMovieNameExist(movieName);
                if(exist == false){
                    System.out.println("validation is proper.. proceed to add movie name");
                    movieNames[index]= movieName;
                    index++;
                    isAdded  = true;
                    System.out.println(movieName+" is got added successfully!!");
                }
                else{
                    System.out.println(movieName+" Movie name already exist .. please add other");
                }
            }
        }
        else{
            System.out.println("moviNames size is full.. you con't proceed to add");
        }
        return isAdded;
    }
    public void  getMovieNames(){
        System.out.println("List Of Movie are: ");
        for(int index = 0;index < movieNames.length; index++){

            System.out.println(movieNames[index]);

        }
    }
    public boolean checkIfMovieNameExist(String movieName){
        System.out.println("Invoked checkIfMovieNameExist");
        boolean exist = false;
        for(int index = 0;index < movieNames.length; index++){
            if(movieNames[index] ==  movieName){
                exist = true;
            }
        }
        return exist;
    }
}
//settter method-to save and update the data we use set