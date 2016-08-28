public class Main {

    private final static String sticker = "facebook";
    private final static String message = "coffee kebab";
    private final static int NUMBER_OF_LETTERS = 'z' - 'a' + 1;
      
    public static void main(String[] args) {
        int[] stickerLetters = new int[NUMBER_OF_LETTERS];
        int[] messageLetters = new int[NUMBER_OF_LETTERS];
        
        for (int c: sticker.toLowerCase().toCharArray()) {
            if (c >= 'a' && c <= 'z')
                stickerLetters[c - 'a']++;
        }
        for (int c: message.toLowerCase().toCharArray()) {
            if (c >= 'a' && c <= 'z')
                messageLetters[c - 'a']++;
        }
        int count = 0;
        for (int i = 0; i < NUMBER_OF_LETTERS; i++) {
            if (messageLetters[i] > 0) {
                if (stickerLetters[i] == 0) {
                    System.out.println("Impossible!");
                    return;
                }
                int c = (int)((double)Math.ceil(messageLetters[i] / (double)stickerLetters[i]));
                if (c > count) {
                    count = c;
                }
            }
        }
        System.out.printf("You need %d stickers%n", count);
    }
}
