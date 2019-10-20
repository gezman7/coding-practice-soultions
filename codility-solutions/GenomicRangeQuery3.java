
import java.util.ArrayList;
import java.util.Collections;

//Amazing solution!
public class Dna3 {
	
	public int[] solution(String S, int[] P, int[] Q) {
		
		char[] ch = S.toCharArray();
		int[] numDna = new int[S.length()];
		
		ArrayList<Integer> A=new ArrayList<>();
		ArrayList<Integer> C=new ArrayList<>();
		ArrayList<Integer> G=new ArrayList<>();
		ArrayList<Integer> T=new ArrayList<>();

		for(int i =0; i<S.length();i++)
		{
			switch(ch[i]) {
			
			case 'A':
				A.add(i);
				break;
			case 'C':
				C.add(i);
				break;
			case 'G':
				G.add(i);
				break;
			case 'T':
				T.add(i);
				break;
				
			}
				
			}
		
		Collections.sort(A);	
		Collections.sort(C);
		Collections.sort(G);
		Collections.sort(T);
		
		
		boolean found =false;
		int high,low,key,mid;
		int[]M =new int[P.length];
		int curMin =4;
		for(int i=0;i<P.length;i++)
		{
		
					     high= A.size()-1;
					     low= 0;
					    while (low <= high) {
					         mid = (low + high) / 2;
					        if (A.get(mid) < P[i]) {
					            low = mid + 1;
					        } else if (A.get(mid) > Q[i]) {
					            high = mid - 1;
					        } else if (A.get(mid)>= P[i]&&A.get(mid)<= Q[i]) {
					            {M[i] = 1;
					            found=true;
					            }
					            break;
					        }
					    }
					    
					    
					    if(!found) {
					     high= C.size()-1;
					     low= 0;
					    while (low <= high) {
					         mid = (low + high) / 2;
					        if (C.get(mid) < P[i]) {
					            low = mid + 1;
					        } else if (C.get(mid) > Q[i]) {
					            high = mid - 1;
					        } else if (C.get(mid)>= P[i]&&C.get(mid)<= Q[i]) {
					            {M[i] = 2;
					            found=true;
					            }
					            break;
					        }
					    }
					    }
					    
					    if(!found) {
						     high= G.size()-1;
						     low= 0;
						    while (low <= high) {
						         mid = (low + high) / 2;
						        if (G.get(mid) < P[i]) {
						            low = mid + 1;
						        } else if (G.get(mid) > Q[i]) {
						            high = mid - 1;
						        } else if (G.get(mid)>= P[i]&&G.get(mid)<= Q[i]) {
						            {M[i] = 3;
						            found=true;
						            }
						            break;
						        }
						    }
						    }
					    
					    if(!found) {
						     high= T.size()-1;
						     low= 0;
						    while (low <= high) {
						         mid = (low + high) / 2;
						        if (T.get(mid) < P[i]) {
						            low = mid + 1;
						        } else if (T.get(mid) > Q[i]) {
						            high = mid - 1;
						        } else if (T.get(mid)>= P[i]&&T.get(mid)<= Q[i]) {
						            {M[i] = 4;
						            found=true;
						            }
						            break;
						        }
						    }
						    }
					    
					    
					   
					
		found=false;		
		}
			
	  return M;
	    }
}
