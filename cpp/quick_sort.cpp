#include <cstdio>
#include <algorithm>

int number, data[10000001]

using namespace std;

int main() {
  scanf("%d", &number);
  for (int i = 0 ; i < number ; i++)
    scanf("%d", &data[i]);

  sort(data, data + number);
  for (int i = 0 ; i < number ; i++)
    printf("%d", &data[i]);

  return 0;
}
