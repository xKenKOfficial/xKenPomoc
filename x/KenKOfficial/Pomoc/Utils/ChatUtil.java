package x.KenKOfficial.Pomoc.Utils;

public class ChatUtil
{
    public static String fixColor(final String msg) {
        return msg.replaceAll("&", "§").replace(">>", "»").replace("<<", "«").replace("{N}", "\n");
    }
    
    public static String stringBuilder(final String[] args, final int liczOdArgumentu) {
        String msg = "";
        for (int i = liczOdArgumentu; i < args.length; ++i) {
            msg = String.valueOf(String.valueOf(String.valueOf(String.valueOf(String.valueOf(String.valueOf(String.valueOf(msg))))))) + args[i];
            if (i <= args.length - 2) {
                msg = String.valueOf(String.valueOf(String.valueOf(String.valueOf(String.valueOf(String.valueOf(String.valueOf(msg))))))) + " ";
            }
        }
        return msg;
    }
}
