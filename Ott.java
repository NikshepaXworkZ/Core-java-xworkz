class Ott
{
static String englishSeries[] ={ "The Witcher","Secret Invasion","Tom Clancy's jack Ryan","hijak","the bear","the last of us","the lincoln lawyer","Succession","Black Mirror","Good omens","House of the dragon","Foundation","Never have i ever","the blacklist","the crowded room","young sheldon","futurama","twisted metal","hostel days","twisted metal","hostel days"};
static String kannadaMovies[] ={"achar co","hostel hudguru bekagidhare","namo bhoothathma 2","yadha yadha hi","galipata 2","shivaji surthakal","abhi","boss","kabza","kanthara","vedha","mufti","pentagon","james","kgf","robert","premam poojyam","gandhadagudi","thothapuri 2","777 charlie","vijayanand","ugram","badava rascal","ratnanprapancha","mugil pete"};
static String hindiSeries[] = {"dahaad","taj","u turn","garmi","yeh meri family","scoop","modern love-chenai","scam 1992","rocket boys","the family man","panchayat","flames","mirzapur","aashram","farzi"};
static String teluguTvSeries[] = {"geetha subramanyam","vyavastha","anger tales","save the tigers","new sense","shaitan","daya","rana naidu","taali","the softeware developer","sunflower","surya","3 roses","kukum bhagya","puli meke","kudi yedamaithe","meet cute","bad trip","oka chinna family story","temproary roomates","triples","gaalivana","Atm","sarkar","bad trip"};
static String malyalamTvSeries[] = {"Blind fold","Jai mahendran","peace","madhuvidhu","irul","janaki","scoot","thera para","10-c","i promise r.i.a","honi boss","ajmal bismi plus two class","rock paper scissors","otsaha ithihasam","kaalkoot","the trial","suzhal","vadhandhi","rufuchakkar","marimayam","chakkappaazham","unmadha,","idiyappam","santhwanam","mathagam"};
 public static void main (String[] ott) 
	 {
		 System.out.println("main started");
		 for ( int doll=kannadaMovies.length-1; doll >= 0 ; doll--) 
	 {
	 System.out.println(kannadaMovies[doll]);
	 }	
	 
		 System.out.println("hindi Series");
		 for ( int nik=14; nik >= 0 ; nik--) 
	 {
	 System.out.println(hindiSeries[nik]);
	 }	
	 System.out.println("main ended");
	 }
}
//invoking method-main
//java is static we need to specify
// variable stores references
//compiler-source code to byte code
//jvm-loads and verifies the code,execute the byte code
//[]-it stores the java command line arguments