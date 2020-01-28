#include <bits/stdc++.h>
using namespace std;
int flagquick=0;

int partition (int arr[], int low, int high)
{
    int pivot = arr[high];
    int i = (low - 1);

    for (int j = low; j <= high - 1; j++)
    {
        if (arr[j] < pivot)
        {
            i++;
            swap(arr[i], arr[j]);

        }
        flagquick+=1;
    }
    //cout<<flagquick<<endl;
    swap(arr[i + 1], arr[high]);
    return (i + 1);
}

void quickSort(int arr[], int low, int high)
{
    if (low < high)
    {
        int pi = partition(arr, low, high);

        quickSort(arr, low, pi - 1);
        quickSort(arr, pi + 1, high);
    }
}




int insertionSort(int arr[], int n)
{
    int i, key, j,flag=0;
    for (i = 1; i < n; i++)
    {
        key = arr[i];
        j = i - 1;


        while (j >= 0 && arr[j] > key)
        {
            arr[j + 1] = arr[j];
            j = j - 1;
            flag++;
        }
        arr[j + 1] = key;
    }
    return flag;
}
int selectionSort(int arr[], int n)
{
	int i, j, min_idx,flag=0;

	for (i = 0; i < n-1; i++)
	{

		min_idx = i;
		for (j = i+1; j < n; j++)
		if (arr[j] < arr[min_idx])
			{
        min_idx = j;
        flag++;
      }


		swap(arr[min_idx], arr[i]);
	}
  return flag;
}

void printArray(int arr[], int size)
{
	int i;
	for (i=0; i < size; i++)
		cout << arr[i] << " ";
	cout << endl;
}


int main()
{
	int arr[100000]={0};
  int arr1[100000]={0};
  int arr2[100000]={0};
  int x;
  int n=10000;
  for(int i=0;i<n;i++)
  {
    x=rand();
    arr[i]=x;
    arr1[i]=x;
    arr2[i]=x;


  }

  clock_t start, end;


  start = clock();
  cout<<"numbers of comaparision selection sort:"<<selectionSort(arr, n)<<endl;
  end = clock();


   double time_taken = double(end - start) / double(CLOCKS_PER_SEC);
    cout << "Time taken by  selection sort : " << fixed
         << time_taken << setprecision(10);
    cout << " sec " << endl;

//int arr1[] = {64, 25, 12, 22, 11, 24,345,90,0,34};

  clock_t start1, end1;
  start1 = clock();

  cout<<"numbers of comaparision in insertion sort:"<<insertionSort(arr1, n)<<endl;
	end1 = clock();


  double time_taken1 = double(end1 - start1) / double(CLOCKS_PER_SEC);
    cout << "Time taken by  insertion sort : " << fixed
         << time_taken1 << setprecision(10);
    cout << " sec " << endl;


  //int arr2[] = {64, 25, 12, 22, 11, 24,345,90,0,34};


 clock_t start2, end2;
  start2 = clock();

  quickSort( arr2,0 ,n-1);
  cout<<"numbers of comaparision in quicksort sort:"<<flagquick<<endl;


  end2 = clock();


  double time_taken2 = double(end2 - start2) / double(CLOCKS_PER_SEC);
    cout << "Time taken by  quick sort : " << fixed
         << time_taken2 << setprecision(10);
    cout << " sec " << endl;


	cout << "Sorted array: \n";
	//printArray(arr, n);
	return 0;
}
