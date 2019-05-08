#include<bits/stdc++.h>
using namespace std;
int main()
{
    int fl = 0;
    string str, s;
    ifstream in;
    ofstream out;
    in.open("submitted.txt");
    out.open("code.cpp");
    while(!in.eof())
    {
        getline(in, str);

        if (fl != 2)
        {
            stringstream strm;

            strm << str;

            while(strm >> s)
            {
                out << s << " ";
                if (s == "main" || s == "main(" || s == "main()" || s == "main(){")
                {
                    fl = 1;
                    continue;
                }

                if (fl == 1)
                {
                    if (s == "{")
                    {
                        out << "freopen(\"input.txt\", \"r\", stdin); \n freopen(\"output.txt\", \"w\", stdout);" << endl;
                        fl = 2;
                    }
                }
            }
            out << endl;
            continue;
        }
        out<<str<<endl;
    }
    return 0;
}
