#include<stdio.h>

void insort(int arr[], int n)
{
 int i, j;
 int key;
 for(i=0; i<n; i++)
 {
  key = arr[i];
  j = i-1;
  
  if(j>=0 && arr[j]>key)
  {
   arr[j+1] = arr[j];
   j = j-1;
  }
 }
arr[j+1] = key;
}

int main()
{
 int arr[] = {4, 35, 69, 42};
 insort(arr, 4);
 int i;
 for(i = 0; i<4; i++)
 {
  printf(" %d ", arr[i]);
 }
}
