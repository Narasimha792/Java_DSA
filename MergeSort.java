class MergeSort {
    void mergeSort(int arr[],int l,int r){
        int m=(l+r)/2;
        if(l<r){
        mergeSort(arr,l,m);
        mergeSort(arr,m+1,r);
        merge(arr,l,m,r);
        }
    }
    void merge(int arr[],int l,int m,int r){
       int n1=m-l+1;
       int n2=r-m;
        
        int arrx[]=new int[n1];
        int arry[]=new int[n2];
        for(int i=0;i<n1;i++){
            arrx[i]=arr[l+i];
        }
        for(int i=0;i<n2;i++){
            arry[i]=arr[m+1+i];
        }
        int i=0;
        int j=0;
        int k=l;
        while(i<n1&&j<n2){
            if(arrx[i]<=arry[j]){
                arr[k]=arrx[i];
                i++;
            }
            else{
                arr[k]=arry[j];
                j++;
            }
            k++;
        }
        while(i<n1){
            arr[k]=arrx[i];
            i++;
            k++;
        }
        while(j<n2){
            arr[k]=arry[j];
            j++;
            k++;
        }
    }
    
    public static void main(String[] args) {
        int arr[]={5,4,3,2,1};
        System.out.println("");
        MergeSort obj=new MergeSort();
        obj.mergeSort(arr,0,arr.length-1);
        for(int i=0;i<arr.length;i++){
            System.out.print(" "+arr[i]);
        }
    }
}
