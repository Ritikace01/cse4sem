#include<stdio.h>
#include<stdlib.h>


int swap(int a, int b)
{
 int temp;
 temp = a;
 a = b;
 b = temp;
return 0;
}

int partition(int arr[], int left, int right)
{
 int pivot = arr[right];
 int j = 0;
 int i = left - 1;
 for(j=left; j<=right-1; j++)
 {
  if(arr[j] < pivot)
  {
   i++;
   swap(arr[i], arr[j]);
  }
 }
swap(arr[i+1], arr[right]);
return i+1;
}

int quicksort(int arr[], int left, int right)
{
 if(left < right)
 {
  int p = partition(arr, left, right);
  quicksort(arr, left, p-1);
  quicksort(arr, p+1, right);
  }
return 0;
}

int main()
{
 int arr[] = {10, 54, 6, 7, 8};
 int i;
 printf("Enter the size of array : ");
 scanf(" %d ", &n);
 quicksort(arr, 0, n-1);
 printf("the sorted array is :");
 for(i=0; i<n; i++)
  {
   printf(" %d ", arr[i]);
  }
 return 0;
}

