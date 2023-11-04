package com.idiomas.H2;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.idiomas.entity.Hiragana;
import com.idiomas.service.hiragana.HiraganaService;



@Component
public class DatosIniciales implements CommandLineRunner {

    private final HiraganaService hiraganaService;



    @Autowired
    public DatosIniciales( HiraganaService hiraganaService)
    {
        this.hiraganaService = hiraganaService;

    }

    @Override
    public void run(String... args) throws Exception {
        System.out.println("Ejecutando Metodo Run");
        try{
            cargarDatosIniciales();
            System.out.println("Datos Cargados Correctamente");
        }catch(Exception e)
        {
            e.printStackTrace();
        }
    }

    public void cargarDatosIniciales()
    {

        Hiragana dato1 = new Hiragana();
        dato1.setHiragana("あ");
        dato1.setRomanji("A");
        hiraganaService.save(dato1);

        Hiragana dato2 = new Hiragana();
        dato2.setHiragana("い");
        dato2.setRomanji("i");
        hiraganaService.save(dato2);

        Hiragana dato3 = new Hiragana();
        dato3.setHiragana("う");
        dato3.setRomanji("u");
        hiraganaService.save(dato3);

        Hiragana dato4 = new Hiragana();
        dato4.setHiragana("え");
        dato4.setRomanji("e");
        hiraganaService.save(dato4);
        

        Hiragana dato5 = new Hiragana();
        dato5.setHiragana("お");
        dato5.setRomanji("o");
        hiraganaService.save(dato5);
        //Lista 

        Hiragana dato6 = new Hiragana();
        dato6.setHiragana("か");
        dato6.setRomanji("ka");
        hiraganaService.save(dato6);

        Hiragana dato7 = new Hiragana();
        dato7.setHiragana("き");
        dato7.setRomanji("ki");
        hiraganaService.save(dato7);

        Hiragana dato8 = new Hiragana();
        dato8.setHiragana("く");    
        dato8.setRomanji("ku");
        hiraganaService.save(dato8);

        Hiragana dato9 = new Hiragana();
        dato9.setHiragana("け");
        dato9.setRomanji("ke");
        hiraganaService.save(dato9);

        Hiragana dato10 = new Hiragana();
        dato10.setHiragana("こ");   
        dato10.setRomanji("ko");
        hiraganaService.save(dato10);
        //Lista

        Hiragana dato11 = new Hiragana();
        dato11.setHiragana("さ");
        dato11.setRomanji("sa");
        hiraganaService.save(dato11);

        Hiragana dato12 = new Hiragana();
        dato12.setHiragana("し");
        dato12.setRomanji("shi");
        hiraganaService.save(dato12);

        Hiragana dato13 = new Hiragana();
        dato13.setHiragana("す");
        dato13.setRomanji("su");
        hiraganaService.save(dato13);

        Hiragana dato14 = new Hiragana();
        dato14.setHiragana("せ");
        dato14.setRomanji("se");
        hiraganaService.save(dato14);

        Hiragana dato15 = new Hiragana();
        dato15.setHiragana("そ");
        dato15.setRomanji("so");
        hiraganaService.save(dato15);
        //Lista

        Hiragana dato16 = new Hiragana();
        dato16.setHiragana("た");
        dato16.setRomanji("ta");
        hiraganaService.save(dato16);


        Hiragana dato17 = new Hiragana();
        dato17.setHiragana("ち");
        dato17.setRomanji("chi");
        hiraganaService.save(dato17);

        Hiragana dato18 = new Hiragana();
        dato18.setHiragana("つ");
        dato18.setRomanji("tsu");
        hiraganaService.save(dato18);

        Hiragana dato19 = new Hiragana();
        dato19.setHiragana("て");
        dato19.setRomanji("te");
        hiraganaService.save(dato19);

        Hiragana dato20 = new Hiragana();
        dato20.setHiragana("と");
        dato20.setRomanji("to");
        hiraganaService.save(dato20);
        //Listo

        Hiragana dato21 = new Hiragana();
        dato21.setHiragana("な");
        dato21.setRomanji("na");
        hiraganaService.save(dato21);

        Hiragana dato22 = new Hiragana();
        dato22.setHiragana("に");
        dato22.setRomanji("ni");
        hiraganaService.save(dato22);

        Hiragana dato23 = new Hiragana();
        dato23.setHiragana("ぬ");
        dato23.setRomanji("nu");
        hiraganaService.save(dato23);

        Hiragana dato24 = new Hiragana();
        dato24.setHiragana("ね");
        dato24.setRomanji("ne");
        hiraganaService.save(dato24);

        Hiragana dato25 = new Hiragana();
        dato25.setHiragana("の");
        dato25.setRomanji("no");
        hiraganaService.save(dato25);
        //Listo


        Hiragana dato26 = new Hiragana();
        dato26.setHiragana("は");   
        dato26.setRomanji("ha");
        hiraganaService.save(dato26);

        Hiragana dato27 = new Hiragana();
        dato27.setHiragana("ひ");
        dato27.setRomanji("hi");
        hiraganaService.save(dato27);

        Hiragana dato28 = new Hiragana();
        dato28.setHiragana("ふ");
        dato28.setRomanji("fu");
        hiraganaService.save(dato28);

        Hiragana dato29 = new Hiragana();
        dato29.setHiragana("へ");
        dato29.setRomanji("he");
        hiraganaService.save(dato29);

        Hiragana dato30 = new Hiragana();
        dato30.setHiragana("ほ");
        dato30.setRomanji("ho");
        hiraganaService.save(dato30);
        //Listo


        Hiragana dato31 = new Hiragana();
        dato31.setHiragana("ま");
        dato31.setRomanji("ma");
        hiraganaService.save(dato31);

        Hiragana dato32 = new Hiragana();
        dato32.setHiragana("み");
        dato32.setRomanji("mi");
        hiraganaService.save(dato32);

        Hiragana dato33 = new Hiragana();
        dato33.setHiragana("む");
        dato33.setRomanji("mu");
        hiraganaService.save(dato33);

        Hiragana dato34 = new Hiragana();
        dato34.setHiragana("め");
        dato34.setRomanji("me");
        hiraganaService.save(dato34);

        Hiragana dato35 = new Hiragana();
        dato35.setHiragana("も");
        dato35.setRomanji("mo");
        hiraganaService.save(dato35);
        //Listo


        Hiragana dato36 = new Hiragana();
        dato36.setHiragana("や");
        dato36.setRomanji("ya");

        Hiragana dato37 = new Hiragana();
        dato37.setHiragana("ゆ");
        dato37.setRomanji("yu");

        Hiragana dato38 = new Hiragana();
        dato38.setHiragana("よ");
        dato38.setRomanji("yo");
        //Listo

        Hiragana dato39 = new Hiragana();
        dato39.setHiragana("ら");
        dato39.setRomanji("ra");

        Hiragana dato40 = new Hiragana();
        dato40.setHiragana("り");
        dato40.setRomanji("ri");

        Hiragana dato41 = new Hiragana();
        dato41.setHiragana("る");
        dato41.setRomanji("ru");

        Hiragana dato42 = new Hiragana();
        dato42.setHiragana("れ");
        dato42.setRomanji("re");

        Hiragana dato43 = new Hiragana();
        dato43.setHiragana("ろ");
        dato43.setRomanji("ro");
        //Listo
        
        Hiragana dato44 = new Hiragana();
        dato44.setHiragana("わ");
        dato44.setRomanji("wa");

        Hiragana dato45 = new Hiragana();
        dato45.setHiragana("を");
        dato45.setRomanji("wo");

        Hiragana dato46 = new Hiragana();
        dato46.setHiragana("ん");
        dato46.setRomanji("n");
        //Listo los 46 Principales

        //Dakuten/Han-Dakuten

        Hiragana dato47 = new Hiragana();
        dato47.setHiragana("が");
        dato47.setRomanji("ga");

        Hiragana dato48 = new Hiragana();
        dato48.setHiragana("ぎ");
        dato48.setRomanji("gi");

        Hiragana dato49 = new Hiragana();
        dato49.setHiragana("ぐ");
        dato49.setRomanji("gu");

        Hiragana dato50 = new Hiragana();
        dato50.setHiragana("げ");
        dato50.setRomanji("ge");

        Hiragana dato51 = new Hiragana();
        dato51.setHiragana("ご");
        dato51.setRomanji("go");
        //--------------------------------

        Hiragana dato52 = new Hiragana();
        dato52.setHiragana("ざ");
        dato52.setRomanji("za");

        Hiragana dato53 = new Hiragana();
        dato53.setHiragana("じ");
        dato53.setRomanji("ji");

        Hiragana dato54 = new Hiragana();
        dato54.setHiragana("ず");
        dato54.setRomanji("zu");

        Hiragana dato55 = new Hiragana();
        dato55.setHiragana("ぜ");
        dato55.setRomanji("ze");

        Hiragana dato56 = new Hiragana();
        dato56.setHiragana("ぞ");
        dato56.setRomanji("zo");
        //-----------------------------

        Hiragana dato57 = new Hiragana();
        dato57.setHiragana("だ");
        dato57.setRomanji("da");

        Hiragana dato58 = new Hiragana();
        dato58.setHiragana("ぢ");
        dato58.setRomanji("ji");

        Hiragana dato59 = new Hiragana();
        dato59.setHiragana("づ");
        dato59.setRomanji("zu");

        Hiragana dato60 = new Hiragana();
        dato60.setHiragana("で");
        dato60.setRomanji("de");

        Hiragana dato61 = new Hiragana();
        dato61.setHiragana("ど");
        dato61.setRomanji("do");
        //---------------------------------

        Hiragana dato62 = new Hiragana();
        dato62.setHiragana("ば");
        dato62.setRomanji("ba");

        Hiragana dato63 = new Hiragana();
        dato63.setHiragana("び");
        dato63.setRomanji("bi");

        Hiragana dato64 = new Hiragana();
        dato64.setHiragana("ぶ");
        dato64.setRomanji("bu");

        Hiragana dato65 = new Hiragana();
        dato65.setHiragana("べ");
        dato65.setRomanji("be");

        Hiragana dato66 = new Hiragana();
        dato66.setHiragana("ぼ");
        dato66.setRomanji("bo");
        //--------------------------------------
        
        Hiragana dato67 = new Hiragana();
        dato67.setHiragana("ぱ");
        dato67.setRomanji("pa");

        Hiragana dato68 = new Hiragana();
        dato68.setHiragana("ぴ");
        dato68.setRomanji("pi");

        Hiragana dato69 = new Hiragana();
        dato69.setHiragana("ぷ");
        dato69.setRomanji("pu");

        Hiragana dato70 = new Hiragana();
        dato70.setHiragana("ぺ");
        dato70.setRomanji("pe");

        Hiragana dato71 = new Hiragana();
        dato71.setHiragana("ぽ");
        dato71.setRomanji("po");

        //--------------------------------
        //Fin Dakuten
        //-----------------------------

        //Inicio Conbinaciones

        // Hiragana dato72 = new Hiragana();
        // dato72.setHiragana("きゃ");
        // dato72.setRomanji("kya");

        // Hiragana dato73 = new Hiragana();
        // dato73.setHiragana("きゅ");
        // dato73.setRomanji("kyu");

        // Hiragana dato74 = new Hiragana();
        // dato74.setHiragana("きょ");
        // dato74.setRomanji("kyo");
        //------------------------------------

        // Hiragana dato78 = new Hiragana();
        // dato78.setHiragana("しゃ");
        // dato78.setRomanji("sha");

        // Hiragana dato79 = new Hiragana();
        // dato79.setHiragana("しゅ");
        // dato79.setRomanji("shu");

        // Hiragana dato80 = new Hiragana();
        // dato80.setHiragana("しょ");
        // dato80.setRomanji("sho");
        //----------------------------------

        // Hiragana dato81 = new Hiragana();
        // dato81.setHiragana("ちゃ");
        // dato81.setRomanji("cha");

        // Hiragana dato82 = new Hiragana();
        // dato82.setHiragana("ちゅ");
        // dato82.setRomanji("chu");

        // Hiragana dato83 = new Hiragana();
        // dato83.setHiragana("ちょ");
        // dato83.setRomanji("cho");
        //----------------------------------

        // Hiragana dato84 = new Hiragana();
        // dato84.setHiragana("にゃ");
        // dato84.setRomanji("nya");

        // Hiragana dato85 = new Hiragana();
        // dato85.setHiragana("にゅ");
        // dato85.setRomanji("nyu");

        // Hiragana dato86 = new Hiragana();
        // dato86.setHiragana("にょ");
        // dato86.setRomanji("nyo");
//-----------------------------------

        // Hiragana dato87 = new Hiragana();
        // dato87.setHiragana("ひゃ");
        // dato87.setRomanji("hya");

        // Hiragana dato88 = new Hiragana();
        // dato88.setHiragana("ひゅ");
        // dato88.setRomanji("hyu");

        // Hiragana dato89 = new Hiragana();
        // dato89.setHiragana("ひょ");
        // dato89.setRomanji("hyo");
//----------------------------------

        // Hiragana dato90 = new Hiragana();
        // dato90.setHiragana("みゃ");
        // dato90.setRomanji("mya");

        // Hiragana dato91 = new Hiragana();
        // dato91.setHiragana("みゅ");
        // dato91.setRomanji("myu");

        // Hiragana dato92 =  new Hiragana();
        // dato92.setHiragana("みょ");
        // dato92.setRomanji("myo");

//-------------------------------

        // Hiragana dato93 = new Hiragana();
        // dato93.setHiragana("りゃ");
        // dato93.setRomanji("rya");

        // Hiragana dato94 = new Hiragana();
        // dato94.setHiragana("りゅ");
        // dato94.setRomanji("ryu");

        // Hiragana dato95 = new Hiragana();
        // dato95.setHiragana("りょ");
        // dato95.setRomanji("ryo");


//------------------------------------

        // Hiragana dato75 = new Hiragana();
        // dato75.setHiragana("ぎゃ");
        // dato75.setRomanji("gya");

        // Hiragana dato76 = new Hiragana();
        // dato76.setHiragana("ぎゅ");
        // dato76.setRomanji("gyu");

        // Hiragana dato77 = new Hiragana();
        // dato77.setHiragana("ぎょ");
        // dato77.setRomanji("gyo");
        //-----------------------------------------

        //-----------------------------------------



    }
    
}
