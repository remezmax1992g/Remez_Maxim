import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class Solution
{
    public static void main(String[] args) throws IOException
    {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String s = "end";
        String a = reader.readLine();
        ArrayList<String> list = new ArrayList<String>();
        while (!a.equals(s))
        {
            list.add(a);
        }
        for (int i = 0; i <list.size(); i++)
        {
            System.out.println(list.get(i));
        }
    }
}