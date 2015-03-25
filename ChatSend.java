public class ChatSend
{
    public static class Server
    {
        static String ip = "172.20.128.64";
        static String user = "chat_user";
        static String pass = "chat_pass";
        static String base = "chat";
    }

    public static void main(String[] argv)
    {
        String input = "";
        int co = BD.ouvrirConnexion(Server.ip, Server.base, Server.user, Server.pass);
        while (input != ":q")
        {
            input = Clavier.saisirString();
            if (input != ":q")
                BD.executerUpdate(co, "INSERT INTO message [(msgTexte, msgPseudo)] VALUES (" + input + ", " + Server.user + ")");
        }
    }
}
