package mynewjava;

import java.util.ArrayList;
import java.util.List;

class GfG
{
void printSpace(String str)
{
if(str.length() == 1) {
System.out.println(str + "$");
return;
}

List<string> soln = new ArrayList<string>();
solve(str, 0, soln);

StringBuilder builder = new StringBuilder();
for(int i = soln.size() - 1; i >= 0; i--) {
builder.append(soln.get(i)).append("$");
}

System.out.println(builder.toString());
}

public static void solve(String s, int i, List<string> list) {
if(i == s.length() - 1) {
list.add(s);
return;
}

String str = s.substring(0, i + 1) + " " + s.substring(i + 1);
solve(str, i + 2, list);
solve(s, i + 1, list);
return;
}
}