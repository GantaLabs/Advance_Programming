package Semester_2.Advance_Programming.Semester_2.PracticalAdvanceProgramming.Chapter_2.Practical;

public class PerpustakaanMain {
    public static void main(String[] args) {

        Buku[] teknologi = new Buku[5];
        Buku[] filsafat = new Buku[5];
        Buku[] sejarah = new Buku[5];
        Buku[] agama = new Buku[5];
        Buku[] psikologi = new Buku[5];
        Buku[] politik = new Buku[5];
        Buku[] fiksi = new Buku[5];

        // ===================== TEKNOLOGI =====================

        teknologi[0] = new Buku("Teknologi","The Shallows",2010,288,1,
                "Buku ini menjelaskan bagaimana internet mempengaruhi cara manusia berpikir dan membaca informasi");

        teknologi[1] = new Buku("Teknologi","AI Superpowers",2018,272,1,
                "Buku ini membahas perkembangan kecerdasan buatan dan persaingan teknologi antara negara besar dunia");

        teknologi[2] = new Buku("Teknologi","21 Lessons",2018,384,1,
                "Buku ini menjelaskan tantangan teknologi modern artificial intelligence politik dan masa depan manusia");

        teknologi[3] = new Buku("Teknologi","Zero to One",2014,224,2,
                "Buku ini membahas cara membangun perusahaan teknologi inovatif dari ide sederhana");

        teknologi[4] = new Buku("Teknologi","The Code Book",1999,416,1,
                "Buku ini menjelaskan sejarah kriptografi dan bagaimana manusia melindungi informasi rahasia");

        // ===================== FILSAFAT =====================

        filsafat[0] = new Buku("Filsafat","Republic",-375,416,1,
                "Buku ini membahas konsep negara ideal keadilan dan filosofi pemerintahan plato");

        filsafat[1] = new Buku("Filsafat","Sophie's World",1991,544,1,
                "Novel filsafat yang menjelaskan sejarah pemikiran filsafat barat melalui cerita menarik");

        filsafat[2] = new Buku("Filsafat","Meditations",180,256,1,
                "Kumpulan refleksi filsafat stoik tentang kehidupan disiplin diri dan kebijaksanaan");

        filsafat[3] = new Buku("Filsafat","Beyond Good and Evil",1886,240,1,
                "Buku filsafat yang mengkritik moralitas tradisional serta nilai nilai manusia");

        filsafat[4] = new Buku("Filsafat","Critique of Pure Reason",1781,856,1,
                "Buku filsafat yang membahas bagaimana manusia memahami pengetahuan dan realitas");

        // ===================== SEJARAH =====================

        sejarah[0] = new Buku("Sejarah","Sapiens",2011,443,1,
                "Buku ini menceritakan sejarah perkembangan manusia dari zaman purba sampai modern");

        sejarah[1] = new Buku("Sejarah","Guns Germs and Steel",1997,480,1,
                "Buku ini menjelaskan faktor geografi teknologi dan lingkungan dalam perkembangan peradaban manusia");

        sejarah[2] = new Buku("Sejarah","The Silk Roads",2015,672,1,
                "Buku ini menjelaskan peran jalur sutra dalam perkembangan ekonomi dan budaya dunia");

        sejarah[3] = new Buku("Sejarah","Sejarah Dunia yang Disembunyikan",2007,640,1,
                "Buku ini membahas sisi sejarah dunia yang jarang diketahui masyarakat umum");

        sejarah[4] = new Buku("Sejarah","1491",2005,560,1,
                "Buku ini menjelaskan kondisi peradaban amerika sebelum kedatangan bangsa eropa");

        // ===================== AGAMA =====================

        agama[0] = new Buku("Agama","Mere Christianity",1952,227,1,
                "Buku ini menjelaskan konsep dasar keimanan moralitas dan kehidupan spiritual manusia");

        agama[1] = new Buku("Agama","The Case for Christ",1998,366,1,
                "Buku ini menyelidiki bukti sejarah tentang kehidupan yesus dan kepercayaan kristen");

        agama[2] = new Buku("Agama","A History of God",1993,460,1,
                "Buku ini membahas sejarah perkembangan konsep tuhan dalam agama besar dunia");

        agama[3] = new Buku("Agama","No God but God",2005,336,1,
                "Buku ini menjelaskan sejarah islam serta perkembangan ajaran dan masyarakat muslim");

        agama[4] = new Buku("Agama","The Purpose Driven Life",2002,368,1,
                "Buku ini membahas tujuan hidup manusia berdasarkan nilai spiritual dan keimanan");

        // ===================== PSIKOLOGI =====================

        psikologi[0] = new Buku("Psikologi","Thinking Fast and Slow",2011,499,1,
                "Buku ini menjelaskan dua sistem berpikir manusia yaitu cepat intuitif dan lambat rasional");

        psikologi[1] = new Buku("Psikologi","Atomic Habits",2018,320,1,
                "Buku ini menjelaskan cara membangun kebiasaan kecil yang membawa perubahan besar");

        psikologi[2] = new Buku("Psikologi","The Psychology of Money",2020,252,1,
                "Buku ini membahas perilaku manusia terhadap uang investasi dan keputusan finansial");

        psikologi[3] = new Buku("Psikologi","Influence",1984,336,1,
                "Buku ini menjelaskan prinsip psikologi yang mempengaruhi keputusan manusia");

        psikologi[4] = new Buku("Psikologi","Quiet",2012,368,1,
                "Buku ini membahas kekuatan kepribadian introvert dalam dunia modern");

        // ===================== POLITIK =====================

        politik[0] = new Buku("Politik","The Prince",1532,140,1,
                "Buku ini membahas strategi kekuasaan politik dan kepemimpinan dalam pemerintahan");

        politik[1] = new Buku("Politik","Leviathan",1651,720,1,
                "Buku ini menjelaskan teori kontrak sosial dan pembentukan negara");

        politik[2] = new Buku("Politik","World Order",2014,432,1,
                "Buku ini membahas sistem politik internasional dan keseimbangan kekuatan dunia");

        politik[3] = new Buku("Politik","The Communist Manifesto",1848,60,2,
                "Buku ini menjelaskan teori perjuangan kelas dan kritik terhadap kapitalisme");

        politik[4] = new Buku("Politik","Das Kapital",1867,1152,1,
                "Buku ini menganalisis sistem ekonomi kapitalisme dan hubungan produksi");

        // ===================== FIKSI =====================

        fiksi[0] = new Buku("Fiksi","Harry Potter",1997,223,1,
                "Cerita tentang penyihir muda yang belajar sihir di sekolah hogwarts");

        fiksi[1] = new Buku("Fiksi","The Lord of the Rings",1954,1178,1,
                "Kisah epik petualangan untuk menghancurkan cincin kekuatan jahat");

        fiksi[2] = new Buku("Fiksi","1984",1949,328,1,
                "Novel distopia tentang pengawasan pemerintah dan kebebasan manusia");

        fiksi[3] = new Buku("Fiksi","To Kill a Mockingbird",1960,281,1,
                "Novel yang membahas keadilan sosial dan diskriminasi rasial");

        fiksi[4] = new Buku("Fiksi","Good Omens",1990,432,2,
                "Cerita humor tentang malaikat dan iblis yang mencoba menghentikan kiamat");

        // ===================== PENULIS =====================

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
        sejarah[4].tambahPenulis("Charles C Mann");

        agama[0].tambahPenulis("CS Lewis");
        agama[1].tambahPenulis("Lee Strobel");
        agama[2].tambahPenulis("Karen Armstrong");
        agama[3].tambahPenulis("Reza Aslan");
        agama[4].tambahPenulis("Rick Warren");

        psikologi[0].tambahPenulis("Daniel Kahneman");
        psikologi[1].tambahPenulis("James Clear");
        psikologi[2].tambahPenulis("Morgan Housel");
        psikologi[3].tambahPenulis("Robert Cialdini");
        psikologi[4].tambahPenulis("Susan Cain");

        politik[0].tambahPenulis("Niccolo Machiavelli");
        politik[1].tambahPenulis("Thomas Hobbes");
        politik[2].tambahPenulis("Henry Kissinger");
        politik[3].tambahPenulis("Karl Marx");
        politik[3].tambahPenulis("Friedrich Engels");
        politik[4].tambahPenulis("Karl Marx");

        fiksi[0].tambahPenulis("JK Rowling");
        fiksi[1].tambahPenulis("JR R Tolkien");
        fiksi[2].tambahPenulis("George Orwell");
        fiksi[3].tambahPenulis("Harper Lee");
        fiksi[4].tambahPenulis("Neil Gaiman");
        fiksi[4].tambahPenulis("Terry Pratchett");


        System.out.println("\n===== LIST BUKU TEKNOLOGI =====");
        for (Buku b : teknologi) {
            b.infoBuku();
            System.out.println();
        }

        System.out.println("\n===== LIST BUKU FILSAFAT =====");
        for (Buku b : filsafat) {
            b.infoBuku();
            System.out.println();
        }

        System.out.println("\n===== LIST BUKU SEJARAH =====");
        for (Buku b : sejarah) {
            b.infoBuku();
            System.out.println();
        }

        System.out.println("\n===== LIST BUKU AGAMA =====");
        for (Buku b : agama) {
            b.infoBuku();
            System.out.println();
        }

        System.out.println("\n===== LIST BUKU PSIKOLOGI =====");
        for (Buku b : psikologi) {
            b.infoBuku();
            System.out.println();
        }

        System.out.println("\n===== LIST BUKU POLITIK =====");
        for (Buku b : politik) {
            b.infoBuku();
            System.out.println();
        }

        System.out.println("\n===== LIST BUKU FIKSI =====");
        for (Buku b : fiksi) {
            b.infoBuku();
            System.out.println();
        }


        System.out.println("Jumlah kata sinopsis buku pertama teknologi : "
                + teknologi[0].hitungJumlahKataSinopsis());

        int kesamaan = teknologi[0].cekKesamaan(teknologi[1]);
        System.out.println("Tingkat kesamaan buku teknologi[0] dan teknologi[1] : "
                + kesamaan + "%");

        Buku salinan = teknologi[0].copy();
        System.out.println("\n===== HASIL COPY OBJECT =====");
        salinan.infoBuku();
    }
}

