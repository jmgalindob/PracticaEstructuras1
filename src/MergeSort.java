    import java.util.LinkedList;
/**
 * Write a description of class MergeSort here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class MergeSort
{
    void merge(LinkedList<pa20192> plan, int l, int m, int r)
    {
        // Find sizes of two subarrays to be merged
        int n1 = m - l + 1;
        int n2 = r - m;
 
        /* Create temp arrays */
        LinkedList<pa20192> L = new LinkedList<pa20192>();
        LinkedList<pa20192> R = new LinkedList<pa20192>();
 
        /*Copy data to temp arrays*/
        for (int i=0; i<n1; ++i){
            L.add(plan.get(i +1));
        }
        for (int j=0; j<n2; ++j){
            R.add(plan.get(m + 1+ j));
        }
 
 
        /* Merge the temp arrays */
 
        // Initial indexes of first and second subarrays
        int i = 0, j = 0;
 
        // Initial index of merged subarry array
        int k = l;
        while (i < n1 && j < n2)
        {
            if (L.get(i).getProfesor() != R.get(i).getProfesor())
            {
                plan.get(k)  = L.get(i).getProfesor();
                i++;
            }
            else
            {
                plan.get(k) = L.get(j).getProfesor();
                j++;
            }
            k++;
        }
 
        /* Copy remaining elements of L[] if any */
        while (i < n1)
        {
             plan.get(k) = L.get(i).getProfesor();
            i++;
            k++;
        }
 
        /* Copy remaining elements of R[] if any */
        while (j < n2)
        {
            plan.get(k) = L.get(j).getProfesor();
            j++;
            k++;
        }
    }
 
    // Main function that sorts arr[l..r] using
    // merge()
    void sort(LinkedList<pa20192> plan, int l, int r)
    {
        if (l < r)
        {
            // Find the middle point
            int m = (l+r)/2;
 
            // Sort first and second halves
            sort(plan, l, m);
            sort(plan , m+1, r);
 
            // Merge the sorted halves
            merge(plan, l, m, r);
        }
   
    }
}

