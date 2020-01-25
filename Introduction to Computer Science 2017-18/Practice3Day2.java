public class Practice3Day2{
	public static void main(String[] args){

	double completions = 402;
	double attempts = 624;
	double yards = 4770;
	double touchdowns = 36;
	double interceptions = 7;

	double a = ((((completions/attempts) * 100) - 30) / 20);
	double b = (((touchdowns/attempts) * 100) / 5);
	double c = ((((9.5 - ((interceptions/attempts) * 100)) / 4)));
	double d = (((yards/attempts) - 3) / 4);

	double Quarterback_Rating = (a + b + c + d) / .06;

	System.out.println(Quarterback_Rating);

	double taylorcompletions = 242;
	double taylorattempts = 380;
	double tayloryards = 3035;
	double taylortouchdowns = 20;
	double taylorinterceptions = 6;

	double taylora = ((((taylorcompletions/taylorattempts) * 100) - 30) / 20);
	double taylorb = (((taylortouchdowns/taylorattempts) * 100) / 5);
	double taylorc = ((((9.5 - ((taylorinterceptions/taylorattempts) * 100)) / 4)));
	double taylord = (((tayloryards/taylorattempts) - 3) / 4);

	double taylorQuarterback_Rating = (taylora + taylorb + taylorc + taylord) / .06;

	System.out.println(taylorQuarterback_Rating);

	double palmercompletions = 342;
	double palmerattempts = 537;
	double palmeryards = 4671;
	double palmertouchdowns = 35;
	double palmerinterceptions = 11;

	double palmera = ((((palmercompletions/palmerattempts) * 100) - 30) / 20);
	double palmerb = (((palmertouchdowns/palmerattempts) * 100) / 5);
	double palmerc = ((((9.5 - ((palmerinterceptions/palmerattempts) * 100)) / 4)));
	double palmerd = (((palmeryards/palmerattempts) - 3) / 4);

	double palmerQuarterback_Rating = (palmera + palmerb + palmerc + palmerd) / .06;

	System.out.println(palmerQuarterback_Rating);

	double dcompletions = 255;
	double dattempts = 386;
	double dyards = 3250;
	double dtouchdowns = 25;
	double dinterceptions = 7;

	double da = ((((dcompletions/dattempts) * 100) - 30) / 20);
	double db = (((dtouchdowns/dattempts) * 100) / 5);
	double dc = ((((9.5 - ((dinterceptions/dattempts) * 100)) / 4)));
	double dd = (((dyards/dattempts) - 3) / 4);

	double dQuarterback_Rating = (da + db + dc + dd) / .06;

	System.out.println(dQuarterback_Rating);

	double ccompletions = 379;
	double cattempts = 543;
	double cyards = 4166;
	double ctouchdowns = 29;
	double cinterceptions = 11;

	double ca = ((((ccompletions/cattempts) * 100) - 30) / 20);
	double cb = (((ctouchdowns/cattempts) * 100) / 5);
	double cc = ((((9.5 - ((cinterceptions/cattempts) * 100)) / 4)));
	double cd = (((cyards/cattempts) - 3) / 4);

	double cQuarterback_Rating = (ca + cb + cc + cd) / .06;

	System.out.println(cQuarterback_Rating);

	double scompletions = 398;
	double sattempts = 592;
	double syards = 4262;
	double stouchdowns = 32;
	double sinterceptions = 13;

	double sa = ((((scompletions/sattempts) * 100) - 30) / 20);
	double sb = (((stouchdowns/sattempts) * 100) / 5);
	double sc = ((((9.5 - ((sinterceptions/sattempts) * 100)) / 4)));
	double sd = (((syards/sattempts) - 3) / 4);

	double sQuarterback_Rating = (sa + sb + sc + sd) / .06;

	System.out.println(sQuarterback_Rating);

	double bcompletions = 428;
	double battempts = 627;
	double byards = 4870;
	double btouchdowns = 32;
	double binterceptions = 11;

	double ba = ((((bcompletions/battempts) * 100) - 30) / 20);
	double bb = (((btouchdowns/battempts) * 100) / 5);
	double bc = ((((9.5 - ((binterceptions/battempts) * 100)) / 4)));
	double bd = (((byards/battempts) - 3) / 4);

	double bQuarterback_Rating = (ba + bb + bc + bd) / .06;

	System.out.println(bQuarterback_Rating);

	double mcompletions = 307;
	double mattempts = 470;
	double myards = 3486;
	double mtouchdowns = 20;
	double minterceptions = 7;

	double ma = ((((mcompletions/mattempts) * 100) - 30) / 20);
	double mb = (((mtouchdowns/mattempts) * 100) / 5);
	double mc = ((((9.5 - ((minterceptions/mattempts) * 100)) / 4)));
	double md = (((myards/mattempts) - 3) / 4);

	double mQuarterback_Rating = (ma + mb + mc + md) / .06;

	System.out.println(mQuarterback_Rating);

	double wcompletions = 329;
	double wattempts = 483;
	double wyards = 4024;
	double wtouchdowns = 34;
	double winterceptions = 8;

	double wa = ((((wcompletions/wattempts) * 100) - 30) / 20);
	double wb = (((wtouchdowns/wattempts) * 100) / 5);
	double wc = ((((9.5 - ((winterceptions/wattempts) * 100)) / 4)));
	double wd = (((wyards/wattempts) - 3) / 4);

	double wQuarterback_Rating = (wa + wb + wc + wd) / .06;

	System.out.println(wQuarterback_Rating);

	double ncompletions = 296;
	double nattempts = 495;
	double nyards = 3837;
	double ntouchdowns = 35;
	double ninterceptions = 10;

	double na = ((((ncompletions/nattempts) * 100) - 30) / 20);
	double nb = (((ntouchdowns/nattempts) * 100) / 5);
	double nc = ((((9.5 - ((ninterceptions/nattempts) * 100)) / 4)));
	double nd = (((nyards/nattempts) - 3) / 4);

	double nQuarterback_Rating = (na + nb + nc + nd) / .06;

	System.out.println(nQuarterback_Rating);



	}
}