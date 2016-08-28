public class Main {

    private final static String sticker = "facebook";
    private final static String message = "coffee kebab";
    private final static int NUMBER_OF_LETTERS = 'z' - 'a' + 1;
    
    
    public static void main(String[] args) {
        int[] stickerCount = new int[NUMBER_OF_LETTERS];
        int[] messageCount = new int[NUMBER_OF_LETTERS];
        
        for (int c: sticker.toLowerCase().toCharArray()) {
            if (c >= 'a' && c <= 'z')
                stickerCount[c - 'a']++;
        }
        for (int c: message.toLowerCase().toCharArray()) {
            if (c >= 'a' && c <= 'z')
                messageCount[c - 'a']++;
        }
        int count = 0;
        for (int i = 0; i < NUMBER_OF_LETTERS; i++) {
            if (messageCount[i] > 0) {
                if (stickerCount[i] == 0) {
                    System.out.println("Impossible!");
                    return;
                }
                int c = (int)((double)Math.ceil(messageCount[i] / (double)stickerCount[i]));
                if (c > count) {
                    count = c;
                }
            }
        }
        System.out.printf("You need %d stickers%n", count);
    }
}
