package UTS;

import java.util.Scanner;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

class Main {

    static void pilihAkom() {
        System.out.println("  Pilih Layanan Akomodasi Anda :");
        System.out.println("===================================");
        System.out.println(" 1. Mobil");
        System.out.println(" 2. Motor");
        System.out.println(" 3. Bus");
        System.out.println("===================================");
        System.out.print("Masukkan pilihan : ");
    }

    static void sopir(){
        System.out.println(" Apakah Ingin Menggunakan Sopir :");
        System.out.println("==================================");
        System.out.println("| 1. Ya                          |");
        System.out.println("| 2. Tidak                       |");
        System.out.println("==================================");
        System.out.print("  Masukkan pilihan : ");
    }
    static void badung(){
        Scanner input = new Scanner(System.in);
        pilihAkom();
        int pilih1 = input.nextInt();
        System.out.println();
        switch(pilih1) {
            case 1:
                sopir();
                int pilih2 = input.nextInt();
                akomodasi a = new akomodasi("Mobil","Kabupaten Badung", 50000);
                a.tampilakomodasi();
                if(pilih2 == 1){
                    System.out.println("Biaya Sopir        :30000");
                    int biaya=30000+ a.biaya;
                    System.out.println("Biaya Total        :"+biaya);
                }
                else if(pilih2 == 2){
                    System.out.println("Anda Tidak Menggunakan Sopir");
                }
                else{
                    System.out.println("Maaf, Input yang Anda Masukkan Salah!\n");
                    badung();
                }
                break;
            case 2:
                akomodasi b = new akomodasi("Motor", "Kabupaten Badung", 30000);
                b.tampilakomodasi();
                break;
            case 3:
                sopir();
                pilih2 = input.nextInt();
                akomodasi c = new akomodasi("Bus", "Kabupaten Badung", 40000);
                c.tampilakomodasi();
                if(pilih2 == 1){
                    System.out.println("Biaya Sopir        :30000");
                    int biaya=30000+ c.biaya;
                    System.out.println("Biaya Total        :"+biaya);
                }
                else if(pilih2 == 2){
                    System.out.println("Anda Tidak Menggunakan Sopir");
                }
                else{
                    System.out.println("Maaf, Input yang Anda Masukkan Salah!\n");
                    badung();
                }
                break;
            default:
                System.out.println("Maaf, Input yang Anda Masukkan Salah!");
                badung();
        }
    }
    static void bangli(){
        Scanner input = new Scanner(System.in);
        pilihAkom();
        int pilih1 = input.nextInt();
        System.out.println();
        switch(pilih1) {
            case 1:
                sopir();
                int pilih2 = input.nextInt();
                akomodasi a = new akomodasi("Mobil","Kabupaten Bangli", 58000);
                a.tampilakomodasi();
                if(pilih2 == 1){
                    System.out.println("Biaya Sopir        :30000");
                    int biaya=30000+ a.biaya;
                    System.out.println("Biaya Total        :"+biaya);
                }
                else if(pilih2 == 2){
                    System.out.println("Anda Tidak Menggunakan Sopir");
                }
                else{
                    System.out.println("Maaf, Input yang Anda Masukkan Salah!\n");
                    bangli();
                }
                break;
            case 2:
                akomodasi b = new akomodasi("Motor", "Kabupaten Bangli", 38000);
                b.tampilakomodasi();
                break;
            case 3:
                sopir();
                pilih2 = input.nextInt();
                akomodasi c = new akomodasi("Bus", "Kabupaten Bangli", 48000);
                c.tampilakomodasi();
                if(pilih2 == 1){
                    System.out.println("Biaya Sopir        :30000");
                    int biaya=30000+ c.biaya;
                    System.out.println("Biaya Total        :"+biaya);
                }
                else if(pilih2 == 2){
                    System.out.println("Anda Tidak Menggunakan Sopir");
                }
                else{
                    System.out.println("Maaf, Input yang Anda Masukkan Salah!\n");
                    bangli();
                }
                break;
            default:
                System.out.println("Maaf, Input yang Anda Masukkan Salah!");
                bangli();
        }
    }
    static void buleleng(){
        Scanner input = new Scanner(System.in);
        pilihAkom();
        int pilih1 = input.nextInt();
        System.out.println();
        switch(pilih1) {
            case 1:
                sopir();
                int pilih2 = input.nextInt();
                akomodasi a = new akomodasi("Mobil","Kabupaten Buleleng", 57000);
                a.tampilakomodasi();
                if(pilih2 == 1){
                    System.out.println("Biaya Sopir        :30000");
                    int biaya=30000+ a.biaya;
                    System.out.println("Biaya Total        :"+biaya);
                }
                else if(pilih2 == 2){
                    System.out.println("Anda Tidak Menggunakan Sopir");
                }
                else{
                    System.out.println("Maaf, Input yang Anda Masukkan Salah!\n");
                    buleleng();
                }
                break;
            case 2:
                akomodasi b = new akomodasi("Motor", "Kabupaten Buleleng", 37000);
                b.tampilakomodasi();
                break;
            case 3:
                sopir();
                pilih2 = input.nextInt();
                akomodasi c = new akomodasi("Bus", "Kabupaten Buleleng", 47000);
                c.tampilakomodasi();
                if(pilih2 == 1){
                    System.out.println("Biaya Sopir        :30000");
                    int biaya=30000+ c.biaya;
                    System.out.println("Biaya Total        :"+biaya);
                }
                else if(pilih2 == 2){
                    System.out.println("Anda Tidak Menggunakan Sopir");
                }
                else{
                    System.out.println("Maaf, Input yang Anda Masukkan Salah!\n");
                    buleleng();
                }
                break;
            default:
                System.out.println("Maaf, Input yang Anda Masukkan Salah!");
                buleleng();
                sopir();
        }
    }
    static void gianyar(){
        Scanner input = new Scanner(System.in);
        pilihAkom();
        int pilih1 = input.nextInt();
        System.out.println();
        switch(pilih1) {
            case 1:
                sopir();
                int pilih2 = input.nextInt();
                akomodasi a = new akomodasi("Mobil","Kabupaten Gianyar", 56000);
                a.tampilakomodasi();
                if(pilih2 == 1){
                    System.out.println("Biaya Sopir        :30000");
                    int biaya=30000+ a.biaya;
                    System.out.println("Biaya Total        :"+biaya);
                }
                else if(pilih2 == 2){
                    System.out.println("Anda Tidak Menggunakan Sopir");
                }
                else{
                    System.out.println("Maaf, Input yang Anda Masukkan Salah!\n");
                    gianyar();
                }
                break;
            case 2:
                akomodasi b = new akomodasi("Motor", "Kabupaten Gianyar", 36000);
                b.tampilakomodasi();
                break;
            case 3:
                sopir();
                pilih2 = input.nextInt();
                akomodasi c = new akomodasi("Bus", "Kabupaten Gianyar", 46000);
                c.tampilakomodasi();
                if(pilih2 == 1){
                    System.out.println("Biaya Sopir        :30000");
                    int biaya=30000+ c.biaya;
                    System.out.println("Biaya Total        :"+biaya);
                }
                else if(pilih2 == 2){
                    System.out.println("Anda Tidak Menggunakan Sopir");
                }
                else{
                    System.out.println("Maaf, Input yang Anda Masukkan Salah!\n");
                    gianyar();
                }
                break;
            default:
                System.out.println("Maaf, Input yang Anda Masukkan Salah!");
                gianyar();
        }
    }
    static void jembrana(){
        Scanner input = new Scanner(System.in);
        pilihAkom();
        int pilih1 = input.nextInt();
        System.out.println();
        switch(pilih1) {
            case 1:
                sopir();
                int pilih2 = input.nextInt();
                akomodasi a = new akomodasi("Mobil","Kabupaten Jembrana", 55000);
                a.tampilakomodasi();
                if(pilih2 == 1){
                    System.out.println("Biaya Sopir        :30000");
                    int biaya=30000+ a.biaya;
                    System.out.println("Biaya Total        :"+biaya);
                }
                else if(pilih2 == 2){
                    System.out.println("Anda Tidak Menggunakan Sopir");
                }
                else{
                    System.out.println("Maaf, Input yang Anda Masukkan Salah!\n");
                    jembrana();
                }
                break;
            case 2:
                akomodasi b = new akomodasi("Motor", "Kabupaten Jembrana", 35000);
                b.tampilakomodasi();
                break;
            case 3:
                sopir();
                pilih2 = input.nextInt();
                akomodasi c = new akomodasi("Bus", "Kabupaten Jembrana", 45000);
                c.tampilakomodasi();
                if(pilih2 == 1){
                    System.out.println("Biaya Sopir        :30000");
                    int biaya=30000+ c.biaya;
                    System.out.println("Biaya Total        :"+biaya);
                }
                else if(pilih2 == 2){
                    System.out.println("Anda Tidak Menggunakan Sopir");
                }
                else{
                    System.out.println("Maaf, Input yang Anda Masukkan Salah!\n");
                    jembrana();
                }
                break;
            default:
                System.out.println("Maaf, Input yang Anda Masukkan Salah!");
                jembrana();
        }
    }
    static void karangasem(){
        Scanner input = new Scanner(System.in);
        pilihAkom();
        int pilih1 = input.nextInt();
        System.out.println();
        switch(pilih1) {
            case 1:
                sopir();
                int pilih2 = input.nextInt();
                akomodasi a = new akomodasi("Mobil","Kabupaten Karangasem", 54000);
                a.tampilakomodasi();
                if(pilih2 == 1){
                    System.out.println("Biaya Sopir        :30000");
                    int biaya=30000+ a.biaya;
                    System.out.println("Biaya Total        :"+biaya);
                }
                else if(pilih2 == 2){
                    System.out.println("Anda Tidak Menggunakan Sopir");
                }
                else{
                    System.out.println("Maaf, Input yang Anda Masukkan Salah!\n");
                    karangasem();
                }
                break;
            case 2:
                akomodasi b = new akomodasi("Motor", "Kabupaten Karangasem", 34000);
                b.tampilakomodasi();
                break;
            case 3:
                sopir();
                pilih2 = input.nextInt();
                akomodasi c = new akomodasi("Bus", "Kabupaten Karangasem", 44000);
                c.tampilakomodasi();
                if(pilih2 == 1){
                    System.out.println("Biaya Sopir        :30000");
                    int biaya=30000+ c.biaya;
                    System.out.println("Biaya Total        :"+biaya);
                }
                else if(pilih2 == 2){
                    System.out.println("Anda Tidak Menggunakan Sopir");
                }
                else{
                    System.out.println("Maaf, Input yang Anda Masukkan Salah!\n");
                    karangasem();
                }
                break;
            default:
                System.out.println("Maaf, Input yang Anda Masukkan Salah!");
                karangasem();
        }
    }
    static void klungkung(){
        Scanner input = new Scanner(System.in);
        pilihAkom();
        int pilih1 = input.nextInt();
        System.out.println();
        switch(pilih1) {
            case 1:
                sopir();
                int pilih2 = input.nextInt();
                akomodasi a = new akomodasi("Mobil","Kabupaten Klungkung", 53000);
                a.tampilakomodasi();
                if(pilih2 == 1){
                    System.out.println("Biaya Sopir        :30000");
                    int biaya=30000+ a.biaya;
                    System.out.println("Biaya Total        :"+biaya);
                }
                else if(pilih2 == 2){
                    System.out.println("Anda Tidak Menggunakan Sopir");
                }
                else{
                    System.out.println("Maaf, Input yang Anda Masukkan Salah!\n");
                    klungkung();
                }
                break;
            case 2:
                akomodasi b = new akomodasi("Motor", "Kabupaten Klungkung", 33000);
                b.tampilakomodasi();
                break;
            case 3:
                sopir();
                pilih2 = input.nextInt();
                akomodasi c = new akomodasi("Bus", "Kabupaten Klungkung", 43000);
                c.tampilakomodasi();
                if(pilih2 == 1){
                    System.out.println("Biaya Sopir        :30000");
                    int biaya=30000+ c.biaya;
                    System.out.println("Biaya Total        :"+biaya);
                }
                else if(pilih2 == 2){
                    System.out.println("Anda Tidak Menggunakan Sopir");
                }
                else{
                    System.out.println("Maaf, Input yang Anda Masukkan Salah!\n");
                    klungkung();
                }
                break;
            default:
                System.out.println("Maaf, Input yang Anda Masukkan Salah!");
                klungkung();
        }
    }
    static void tabanan(){
        Scanner input = new Scanner(System.in);
        pilihAkom();
        int pilih1 = input.nextInt();
        System.out.println();
        switch(pilih1) {
            case 1:
                sopir();
                int pilih2 = input.nextInt();
                akomodasi a = new akomodasi("Mobil","Kabupaten Tabanan", 52000);
                a.tampilakomodasi();
                if(pilih2 == 1){
                    System.out.println("Biaya Sopir        :30000");
                    int biaya=30000+ a.biaya;
                    System.out.println("Biaya Total        :"+biaya);
                }
                else if(pilih2 == 2){
                    System.out.println("Anda Tidak Menggunakan Sopir");
                }
                else{
                    System.out.println("Maaf, Input yang Anda Masukkan Salah!\n");
                    tabanan();
                }
                break;
            case 2:
                akomodasi b = new akomodasi("Motor", "Kabupaten Tabanan", 32000);
                b.tampilakomodasi();
                break;
            case 3:
                sopir();
                pilih2 = input.nextInt();
                akomodasi c = new akomodasi("Bus", "Kabupaten Tabanan", 42000);
                c.tampilakomodasi();
                if(pilih2 == 1){
                    System.out.println("Biaya Sopir        :30000");
                    int biaya=30000+ c.biaya;
                    System.out.println("Biaya Total        :"+biaya);
                }
                else if(pilih2 == 2){
                    System.out.println("Anda Tidak Menggunakan Sopir");
                }
                else{
                    System.out.println("Maaf, Input yang Anda Masukkan Salah!\n");
                    tabanan();
                }
                break;
            default:
                System.out.println("Maaf, Input yang Anda Masukkan Salah!");
                tabanan();
        }
    }
    static void denpasar(){
        Scanner input = new Scanner(System.in);
        pilihAkom();
        int pilih1 = input.nextInt();
        System.out.println();
        switch(pilih1) {
            case 1:
                sopir();
                int pilih2 = input.nextInt();
                akomodasi a = new akomodasi("Mobil","Kabupaten Denpasar", 51000);
                a.tampilakomodasi();
                if(pilih2 == 1){
                    System.out.println("Biaya Sopir        :30000");
                    int biaya=30000+ a.biaya;
                    System.out.println("Biaya Total        :"+biaya);
                }
                else if(pilih2 == 2){
                    System.out.println("Anda Tidak Menggunakan Sopir");
                }
                else{
                    System.out.println("Maaf, Input yang Anda Masukkan Salah!\n");
                    denpasar();
                }
                break;
            case 2:
                akomodasi b = new akomodasi("Motor", "Kabupaten Denpasar", 31000);
                b.tampilakomodasi();
                break;
            case 3:
                sopir();
                pilih2 = input.nextInt();
                akomodasi c = new akomodasi("Bus", "Kabupaten Denpasar", 41000);
                c.tampilakomodasi();
                if(pilih2 == 1){
                    System.out.println("Biaya Sopir        :30000");
                    int biaya=30000+ c.biaya;
                    System.out.println("Biaya Total        :"+biaya);
                }
                else if(pilih2 == 2){
                    System.out.println("Anda Tidak Menggunakan Sopir");
                }
                else{
                    System.out.println("Maaf, Input yang Anda Masukkan Salah!\n");
                    denpasar();
                }
                break;
            default:
                System.out.println("Maaf, Input yang Anda Masukkan Salah!");
                denpasar();
        }
    }

    static void tujuan(){
        Scanner input = new Scanner(System.in);

        System.out.println(" Lokasi yang Ingin Anda Tuju :");
        System.out.println("===============================");
        System.out.println("| 1. Badung                   |");
        System.out.println("| 2. Bangli                   |");
        System.out.println("| 3. Buleleng                 |");
        System.out.println("| 4. Gianyar                  |");
        System.out.println("| 5. Jembrana                 |");
        System.out.println("| 6. Karangasem               |");
        System.out.println("| 7. Klungkung                |");
        System.out.println("| 8. Tabanan                  |");
        System.out.println("| 9. Denpasar                 |");
        System.out.println("===============================");
        System.out.print("  Masukkan pilihan : ");
        int pilih = input.nextInt();
        System.out.println();
        switch(pilih){
            case 1:
                System.out.println("Anda Akan Pergi Ke Kabupaten Badung");
                badung();
                break;
            case 2:
                System.out.println("Anda Akan Pergi Ke Kabupaten Bangli");
                bangli();
                break;
            case 3:
                System.out.println("Anda Akan Pergi Ke Kabupaten Buleleng");
                buleleng();
                break;
            case 4:
                System.out.println("Anda Akan Pergi Ke Kabupaten Gianyar");
                gianyar();
                break;
            case 5:
                System.out.println("Anda Akan Pergi Ke Kabupaten Jembrana");
                jembrana();
                break;
            case 6:
                System.out.println("Anda Akan Pergi Ke Kabupaten Karangasem");
                karangasem();
                break;
            case 7:
                System.out.println("Anda Akan Pergi Ke Kabupaten Klungkung");
                klungkung();
                break;
            case 8:
                System.out.println("Anda Akan Pergi Ke Kabupaten Tabanan");
                tabanan();
                break;
            case 9:
                System.out.println("Anda Akan Pergi Ke Kabupaten Denpasar");
                denpasar();
                break;
            default:
                System.out.println("Maaf, Input yang Anda Masukkan Salah!\n");
                tujuan();
        }
        ulang();
    }
    static void ulang(){
        Scanner input = new Scanner(System.in);
        System.out.println("\n   Apakah Anda Ingin Mengulang :");
        System.out.println("==================================");
        System.out.println("| 1. Ya                          |");
        System.out.println("| 2. Tidak                       |");
        System.out.println("==================================");
        System.out.print("  Masukkan pilihan : ");
        int pilih3 = input.nextInt();
        if(pilih3 == 1){
            tujuan();
        }
        else if(pilih3 == 2){
            System.exit(0);
        }
        else{
            System.out.println("Maaf, Input yang Anda Masukkan Salah!\n");
            ulang();
        }
    }

    public static void main (String[] args) {
        LocalDateTime date = LocalDateTime.now();
        DateTimeFormatter myFormatObj = DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm:ss");
        String formattedDate = date.format(myFormatObj);
        System.out.println("     "+formattedDate);

        tujuan();

    }
}
