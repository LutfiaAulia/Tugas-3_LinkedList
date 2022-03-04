import java.util.LinkedList;

public class Tugas3_LinkedList {
    public static void main(String[] args) {
        //Creat LinkedList
        LinkedList <String> kuliah = new LinkedList<String>();
        kuliah.add("Winda Adelia");
        kuliah.add("Pasaman");
        LinkedList <String> data = new LinkedList<String>();
        data.add("2111521004");
        data.add("Lutfia Aulia");
        data.add("Agam");
        System.out.println("\nMencetak semua element pada LinkedList");
        System.out.println("Tampilan data pada LinkedList kuliah : "+kuliah+" Ukurannya: "+kuliah.size());
        System.out.println("Tampilan data pada LinkedList data : "+data+" Ukurannya: "+data.size());

        //Add data baru
        System.out.println("\nMenambahkan data baru");
        data.addFirst("2111523024");
        data.addLast("2111521002");
        data.add(1,"Khairin Nisa");
        data.addAll(kuliah);
        System.out.println("Setelah add data : "+data+" Ukurannya: "+data.size());

        //Menyisipkan data baru
        System.out.println("\nMenyisipkan data baru");
        data.set(0,"Kelas B");
        data.set(7,"Pekanbaru");
        System.out.println("Setelah disisipkan : "+data+" Ukurannya: "+data.size());

        //Menghapus data pada LinkedList
        System.out.println("\nMenghapus data yang dipilih");
        data.removeFirst();
        data.removeLast();
        data.remove(0);
        data.remove(4);
        data.remove(3);
        System.out.println("Setelah diremove: "+data+" Ukurannya: "+data.size());

        //Menampilkan data yang ada pada LinkedList berdasarkan indeks yang diinginkan
        System.out.println("\nMenampilkan data yang dipilih");
        System.out.println("Data teratas: "+ data.getFirst());
        System.out.println("Data terbawah: "+ data.getLast());
        System.out.println("Data pada indeks 1: "+ data.get(1));
        System.out.println("Data pada indeks 2: "+ data.get(2));

        //Menghilangkan dan menambahkan data diawal LinkedList
        System.out.println("\nMenghilangkan data pada indeks paling awal");
        data.pop();
        System.out.println("Setelah menggunakan fungsi pop: "+data);
        System.out.println("Menambahkan data baru pada indeks paling awal");
        data.push("2111521004");
        data.push("Kelas B");
        System.out.println("Setelah menggunakan fungsi push: "+data);

        //Mengecek List kosong atau tidak
        System.out.println("\nMengecek List kosong atau tidak");
        System.out.println("Mengecek LinkedList: "+data.isEmpty());
        data.clear();
        System.out.println("Mengecek LinkedList: "+data.isEmpty());
    }
}
