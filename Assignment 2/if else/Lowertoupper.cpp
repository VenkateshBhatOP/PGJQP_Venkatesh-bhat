#include<iostream>
using namespace std;
class Lower_Upper
{
    char lower;
    public:void lcase()
    {
        cout<<"Enter a character in lower case:";
        cin>>lower;
        lower=lower-32;
        cout<<"The character in upper case is:"<<lower;
    }

};
int main()
{
    Lower_Upper obj;
    obj.lcase();
}
