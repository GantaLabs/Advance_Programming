package Semester_2.Advance_Programming.Semester_2.PracticalAdvanceProgramming.Chapter_1.Practical;

public class PerpustakaanMain {
    public static void main (String[] args) {
        Buku[] teknologi = new Buku[5];
        Buku[] filsafat = new Buku[5];
        Buku[] sejarah = new Buku[5];
        Buku[] agama = new Buku[5];
        Buku[] psikologi = new Buku[5];
        Buku[] politik = new Buku[5];
        Buku[] fiksi = new Buku[5];


        teknologi[0] = new Buku();
        teknologi[0].setKategori("Teknologi");
        teknologi[0].setNamaBuku("The Shallows");
        teknologi[0].setTahunTerbit(2010);
        teknologi[0].setJumlahHalaman(288);
        teknologi[0].setJumlahPenulis(1);

        teknologi[1] = new Buku();
        teknologi[1].setKategori("Teknologi");
        teknologi[1].setNamaBuku("AI Superpowers");
        teknologi[1].setTahunTerbit(2018);
        teknologi[1].setJumlahHalaman(272);
        teknologi[1].setJumlahPenulis(1);

        teknologi[2] = new Buku();
        teknologi[2].setKategori("Teknologi");
        teknologi[2].setNamaBuku("21 Lessons");
        teknologi[2].setTahunTerbit(2018);
        teknologi[2].setJumlahHalaman(384);
        teknologi[2].setJumlahPenulis(1);

        teknologi[3] = new Buku();
        teknologi[3].setKategori("Teknologi");
        teknologi[3].setNamaBuku("Zero to One");
        teknologi[3].setTahunTerbit(2014);
        teknologi[3].setJumlahHalaman(224);
        teknologi[3].setJumlahPenulis(2);

        teknologi[4] = new Buku();
        teknologi[4].setKategori("Teknologi");
        teknologi[4].setNamaBuku("The Code Book");
        teknologi[4].setTahunTerbit(1999);
        teknologi[4].setJumlahHalaman(416);
        teknologi[4].setJumlahPenulis(1);

        filsafat[0] = new Buku();
        filsafat[0].setKategori("Filsafat");
        filsafat[0].setNamaBuku("Republic");
        filsafat[0].setTahunTerbit(-375);
        filsafat[0].setJumlahHalaman(416);
        filsafat[0].setJumlahPenulis(1);

        filsafat[1] = new Buku();
        filsafat[1].setKategori("Filsafat");
        filsafat[1].setNamaBuku("Sophie's World");
        filsafat[1].setTahunTerbit(1991);
        filsafat[1].setJumlahHalaman(544);
        filsafat[1].setJumlahPenulis(1);

        filsafat[2] = new Buku();
        filsafat[2].setKategori("Filsafat");
        filsafat[2].setNamaBuku("Meditations");
        filsafat[2].setTahunTerbit(180);
        filsafat[2].setJumlahHalaman(256);
        filsafat[2].setJumlahPenulis(1);

        filsafat[3] = new Buku();
        filsafat[3].setKategori("Filsafat");
        filsafat[3].setNamaBuku("Beyond Good and Evil");
        filsafat[3].setTahunTerbit(1886);
        filsafat[3].setJumlahHalaman(240);
        filsafat[3].setJumlahPenulis(1);

        filsafat[4] = new Buku();
        filsafat[4].setKategori("Filsafat");
        filsafat[4].setNamaBuku("Critique of Pure Reason");
        filsafat[4].setTahunTerbit(1781);
        filsafat[4].setJumlahHalaman(856);
        filsafat[4].setJumlahPenulis(1);

        sejarah[0] = new Buku();
        sejarah[0].setKategori("Sejarah");
        sejarah[0].setNamaBuku("Sapiens");
        sejarah[0].setTahunTerbit(2011);
        sejarah[0].setJumlahHalaman(443);
        sejarah[0].setJumlahPenulis(1);

        sejarah[1] = new Buku();
        sejarah[1].setKategori("Sejarah");
        sejarah[1].setNamaBuku("Guns, Germs, and Steel");
        sejarah[1].setTahunTerbit(1997);
        sejarah[1].setJumlahHalaman(480);
        sejarah[1].setJumlahPenulis(1);

        sejarah[2] = new Buku();
        sejarah[2].setKategori("Sejarah");
        sejarah[2].setNamaBuku("The Silk Roads");
        sejarah[2].setTahunTerbit(2015);
        sejarah[2].setJumlahHalaman(672);
        sejarah[2].setJumlahPenulis(1);

        sejarah[3] = new Buku();
        sejarah[3].setKategori("Sejarah");
        sejarah[3].setNamaBuku("Sejarah Dunia yg Disembunyikan");
        sejarah[3].setTahunTerbit(2007);
        sejarah[3].setJumlahHalaman(640);
        sejarah[3].setJumlahPenulis(1);

        sejarah[4] = new Buku();
        sejarah[4].setKategori("Sejarah");
        sejarah[4].setNamaBuku("1491");
        sejarah[4].setTahunTerbit(2005);
        sejarah[4].setJumlahHalaman(560);
        sejarah[4].setJumlahPenulis(1);

        agama[0] = new Buku();
        agama[0].setKategori("Agama");
        agama[0].setNamaBuku("Mere Christianity");
        agama[0].setTahunTerbit(1952);
        agama[0].setJumlahHalaman(227);
        agama[0].setJumlahPenulis(1);

        agama[1] = new Buku();
        agama[1].setKategori("Agama");
        agama[1].setNamaBuku("The Case for Christ");
        agama[1].setTahunTerbit(1998);
        agama[1].setJumlahHalaman(366);
        agama[1].setJumlahPenulis(1);

        agama[2] = new Buku();
        agama[2].setKategori("Agama");
        agama[2].setNamaBuku("A History of God");
        agama[2].setTahunTerbit(1993);
        agama[2].setJumlahHalaman(460);
        agama[2].setJumlahPenulis(1);

        agama[3] = new Buku();
        agama[3].setKategori("Agama");
        agama[3].setNamaBuku("No God but God");
        agama[3].setTahunTerbit(2005);
        agama[3].setJumlahHalaman(336);
        agama[3].setJumlahPenulis(1);

        agama[4] = new Buku();
        agama[4].setKategori("Agama");
        agama[4].setNamaBuku("The Purpose Driven Life");
        agama[4].setTahunTerbit(2002);
        agama[4].setJumlahHalaman(368);
        agama[4].setJumlahPenulis(1);

        psikologi[0] = new Buku();
        psikologi[0].setKategori("Psikologi");
        psikologi[0].setNamaBuku("Thinking, Fast and Slow");
        psikologi[0].setTahunTerbit(2011);
        psikologi[0].setJumlahHalaman(499);
        psikologi[0].setJumlahPenulis(1);

        psikologi[1] = new Buku();
        psikologi[1].setKategori("Psikologi");
        psikologi[1].setNamaBuku("Atomic Habits");
        psikologi[1].setTahunTerbit(2018);
        psikologi[1].setJumlahHalaman(320);
        psikologi[1].setJumlahPenulis(1);

        psikologi[2] = new Buku();
        psikologi[2].setKategori("Psikologi");
        psikologi[2].setNamaBuku("The Psychology of Money");
        psikologi[2].setTahunTerbit(2020);
        psikologi[2].setJumlahHalaman(252);
        psikologi[2].setJumlahPenulis(1);

        psikologi[3] = new Buku();
        psikologi[3].setKategori("Psikologi");
        psikologi[3].setNamaBuku("Influence");
        psikologi[3].setTahunTerbit(1984);
        psikologi[3].setJumlahHalaman(336);
        psikologi[3].setJumlahPenulis(1);

        psikologi[4] = new Buku();
        psikologi[4].setKategori("Psikologi");
        psikologi[4].setNamaBuku("Quiet");
        psikologi[4].setTahunTerbit(2012);
        psikologi[4].setJumlahHalaman(368);
        psikologi[4].setJumlahPenulis(1);

        politik[0] = new Buku();
        politik[0].setKategori("Politik");
        politik[0].setNamaBuku("The Prince");
        politik[0].setTahunTerbit(1532);
        politik[0].setJumlahHalaman(140);
        politik[0].setJumlahPenulis(1);

        politik[1] = new Buku();
        politik[1].setKategori("Politik");
        politik[1].setNamaBuku("Leviathan");
        politik[1].setTahunTerbit(1651);
        politik[1].setJumlahHalaman(720);
        politik[1].setJumlahPenulis(1);

        politik[2] = new Buku();
        politik[2].setKategori("Politik");
        politik[2].setNamaBuku("World Order");
        politik[2].setTahunTerbit(2014);
        politik[2].setJumlahHalaman(432);
        politik[2].setJumlahPenulis(1);

        politik[3] = new Buku();
        politik[3].setKategori("Politik");
        politik[3].setNamaBuku("The Communist Manifesto");
        politik[3].setTahunTerbit(1848);
        politik[3].setJumlahHalaman(60);
        politik[3].setJumlahPenulis(2);

        politik[4] = new Buku();
        politik[4].setKategori("Politik");
        politik[4].setNamaBuku("Das Kapital");
        politik[4].setTahunTerbit(1867);
        politik[4].setJumlahHalaman(1152);
        politik[4].setJumlahPenulis(1);

        fiksi[0] = new Buku();
        fiksi[0].setKategori("Fiksi");
        fiksi[0].setNamaBuku("Harry Potter");
        fiksi[0].setTahunTerbit(1997);
        fiksi[0].setJumlahHalaman(223);
        fiksi[0].setJumlahPenulis(1);

        fiksi[1] = new Buku();
        fiksi[1].setKategori("Fiksi");
        fiksi[1].setNamaBuku("The Lord of the Rings");
        fiksi[1].setTahunTerbit(1954);
        fiksi[1].setJumlahHalaman(1178);
        fiksi[1].setJumlahPenulis(1);

        fiksi[2] = new Buku();
        fiksi[2].setKategori("Fiksi");
        fiksi[2].setNamaBuku("1984");
        fiksi[2].setTahunTerbit(1949);
        fiksi[2].setJumlahHalaman(328);
        fiksi[2].setJumlahPenulis(1);

        fiksi[3] = new Buku();
        fiksi[3].setKategori("Fiksi");
        fiksi[3].setNamaBuku("To Kill a Mockingbird");
        fiksi[3].setTahunTerbit(1960);
        fiksi[3].setJumlahHalaman(281);
        fiksi[3].setJumlahPenulis(1);

        fiksi[4] = new Buku();
        fiksi[4].setKategori("Fiksi");
        fiksi[4].setNamaBuku("Good Omens");
        fiksi[4].setTahunTerbit(1990);
        fiksi[4].setJumlahHalaman(432);
        fiksi[4].setJumlahPenulis(2);

        // Nama Penulis

        teknologi[0].tambahPenulis("Nicholas Carr");
        teknologi[1].tambahPenulis("Kai-Fu Lee");
        teknologi[2].tambahPenulis("Yuval Noah Harari");
        teknologi[3].tambahPenulis("Peter Thiel");
        teknologi[3].tambahPenulis("Blake Masters");
        teknologi[4].tambahPenulis("Simon Singh");

        filsafat[0].tambahPenulis("Plato");
        filsafat[1].tambahPenulis("Jostein Gaarder");
        filsafat[2].tambahPenulis("Marcus Aurelius");
        filsafat[3].tambahPenulis("Friedrich Nietzsche");
        filsafat[4].tambahPenulis("Immanuel Kant");

        sejarah[0].tambahPenulis("Yuval Noah Harari");
        sejarah[1].tambahPenulis("Jared Diamond");
        sejarah[2].tambahPenulis("Peter Frankopan");
        sejarah[3].tambahPenulis("Jonathan Black");
        sejarah[4].tambahPenulis("Charles C. Mann");

        agama[0].tambahPenulis("C.S. Lewis");
        agama[1].tambahPenulis("Lee Strobel");
        agama[2].tambahPenulis("Karen Armstrong");
        agama[3].tambahPenulis("Reza Aslan");
        agama[4].tambahPenulis("Rick Warren");

        psikologi[0].tambahPenulis("Daniel Kahneman");
        psikologi[1].tambahPenulis("James Clear");
        psikologi[2].tambahPenulis("Morgan Housel");
        psikologi[3].tambahPenulis("Robert B. Cialdini");
        psikologi[4].tambahPenulis("Susan Cain");

        politik[0].tambahPenulis("Niccolo Machiavelli");
        politik[1].tambahPenulis("Thomas Hobbes");
        politik[2].tambahPenulis("Henry Kissinger");
        politik[3].tambahPenulis("Karl Marx");
        politik[3].tambahPenulis("Friedrich Engels");
        politik[4].tambahPenulis("Karl Marx");

        fiksi[0].tambahPenulis("J.K. Rowling");
        fiksi[1].tambahPenulis("J.R.R. Tolkien");
        fiksi[2].tambahPenulis("George Orwell");
        fiksi[3].tambahPenulis("Harper Lee");
        fiksi[4].tambahPenulis("Neil Gaiman");
        fiksi[4].tambahPenulis("Terry Pratchett");



        System.out.println("\n===== LIST BUKU TEKNOLOGI =====");
        for (Buku buku : teknologi) {
            buku.infoBuku();
            System.out.println();
        }

        System.out.println("\n=====  LIST BUKU FILSAFAT  =====");
        for (Buku buku : filsafat) {
            buku.infoBuku();
            System.out.println();
        }

        System.out.println("\n=====  LIST BUKU SEJARAH  =====");
        for (Buku buku : sejarah) {
            buku.infoBuku();
            System.out.println();
        }

        System.out.println("\n=====  LIST BUKU AGAMA  =====");
        for (Buku buku : agama) {
            buku.infoBuku();
            System.out.println();
        }

        System.out.println("\n=====  LIST BUKU PSIKOLOGI  =====");
        for (Buku buku : psikologi) { 
            buku.infoBuku();
            System.out.println();
        }

        System.out.println("\n=====  LIST BUKU POLITIK  =====");
        for (Buku buku : politik) {
            buku.infoBuku();
            System.out.println();
        }

        System.out.println("\n=====  LIST BUKU FIKSI  =====");
        for (Buku buku : fiksi) {
            buku.infoBuku();
            System.out.println();
        }
    }
}
