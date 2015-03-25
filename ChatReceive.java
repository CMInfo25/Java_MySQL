public class ChatReceive
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
        int res;
        int co = BD.ouvrirConnexion(Server.ip, Server.base, Server.user, Server.pass);
        while (true)
        {
            res = BD.executerSelect(co, "SELECT * FROM message");
            while (BD.suivant(res))
            {

            }
        }
    }
}
