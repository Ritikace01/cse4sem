#include <stdio.h>
#include <stdlib.h>
#include <time.h>
int a[100000], a1[100000], n, count = 0;
void refArr()
{
 int i;
 count = 0;
 for (i = 0; i < n; i++)
 a[i] = a1[i];
}
//Merge Sort
void merge(int l, int m, int h)
{
 int L[100000], R[100000], n1 = m - l + 1, n2 = h - m, i = 0, j = 0, k = l;
 while (i < n1)
 {
 L[i] = a[l + i];
 i++;
 }
 while (j < n2)
 {
 R[j] = a[m + 1 + j];
 j++;
 }
 i = j = 0;
 while (i < n1 && j < n2)
 {
 if (L[i] <= R[j] && ++count)
 {
 a[k] = L[i];
 i++;
 }
 else
 {
 a[k] = R[j];
 j++;
 }
 k++;
 }
 while (i < n1)
 {
 a[k] = L[i];
 i++;
 k++;
 }
 while (j < n2)
 {
 a[k] = R[j];
 j++;
 k++;
 }
}
void mergesort(int l, int h)
{
 if (l < h)
 {
 int m = (l + h) / 2;
 mergesort(l, m);
 mergesort(m + 1, h);
 merge(l, m, h);
 }
}
//Quick Sort
void swap(int x, int y)
{
 int t = a[x];
 a[x] = a[y];
 a[y] = t;
}
int partition(int l, int h)
{
 int pivot = a[h], i = l, j = 0;
 for (j = l; j < h; j++)
 {
 if (a[j] < pivot && ++count)
 {
 swap(i, j);
 i++;
 }
 }
 swap(i, h);
 return i;
}
void quicksort(int l, int h)
{
 if (l < h)
 {
 int p = partition(l, h);
 ;
 quicksort(l, p - 1);
 quicksort(p + 1, h);
 }
 else
 return;
}
//Main
void main()
{
 int i, j;
 clock_t beg, end;
 srand(time(0));
 scanf("%ld", &n);
 printf("Size: %ld\n", n);
 for (i = 0; i < n; i++)
 {
 a[i] = (rand() % 2000) + 2000;
 a1[i] = a[i];
 }
 beg = clock();
 mergesort(0, n-1);
 end = clock();
double t1 = (double)(end - beg) / CLOCKS_PER_SEC;
 printf("Merge Sort:\n Time: %0.3f ms\n Comparisons: %ld\n", t1 * 1000, count);
 refArr();
 beg = clock();
 quicksort(0, n - 1);
 end = clock();
 double t2 = (double)(end - beg) / CLOCKS_PER_SEC;
 printf("Quick Sort:\n Time: %0.3f ms\n Comparisons: %ld\n", t2 * 1000, count);
}
