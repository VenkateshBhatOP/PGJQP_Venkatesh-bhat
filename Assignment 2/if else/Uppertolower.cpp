#include<iostream>
using namespace std;
class Upper_Lower
{
    char upper;
    public:void ucase()
    {
        cout<<"Enter a upper case character:";
        cin>>upper;
        upper=upper+32;
        cout<<"The character in lower case is:"<<upper;
    }
};
int main()
{
    Upper_Lower obj;
    obj.ucase();
}
