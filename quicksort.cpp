#include<stdio.h>
#include<stdlib.h>


void swap(int *a, int *b)
{
 int temp;
 temp = *a;
 *a = *b;
 *b = temp;
}

void partition(int arr[], int left, int right)
{
 int pivot = arr[right];
 int i = left - 1;
 for(int j=0; j <= right-1; j++)
 {
  if(arr[j] < pivot)
  {
   i++;
   swap(&arr[i], arr[j]);
  }
 }
swap(&arr[i+1], arr[j]);
}

void quicksort(int arr[], int left, int right)
{
 if(left < right)
 {
  int p = partition(arr, left, right);
  partition(arr, left, p-1);
  partition(arr, p-1, right);
  }
}

int main()
{
 int arr[];
 printf("enter the number of elements");
 scanf("%d", &n);
 for(int i=0; i<n; i++)
 {
  scanf("%d", arr[i]);
 }
quicksort(arr, 0, n-1);
printf("the sorted array is :");
for(i=0; i<n; i++)
{
 printf("%d", arr[i]);
}
return 0;
}

