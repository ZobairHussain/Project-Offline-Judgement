#include<bits/stdc++.h>
using namespace std;
int main()
{
    int t =6;
    FILE *in,*jg, *ou;

    in = fopen("output.txt","r");

    jg=fopen("judge.txt", "r");

    ou = fopen("verdict.txt", "w");

    char si[1000000], sj[1000000];

    while(t--)
    {
        fscanf(jg, "%s", sj);
//        getchar();
        fscanf(in, "%s", si);
  //      getchar();

   //     printf("t = %d\njudge = %s\ninput = %s\n",t,  sj, si);

        if (strcmp(si, sj) != 0)
        {
            fprintf(ou, "Wrong Answer\n");
            fclose(in);
            fclose(jg);
            fclose(ou);
            return 0;
        }
    }
            fprintf(ou, "Accepted\n");
            fclose(in);
            fclose(jg);
            fclose(ou);
    return 0;
}
