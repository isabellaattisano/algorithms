#include <stdio.h>
int euclid(int m, int n){
    int r;
    while(n!=0){
        r = m %n;
        m = n;
        n = r;
    }
    return m;
}

int main(){
    int ans = euclid(60, 24);
    printf("%d\n", ans);
}