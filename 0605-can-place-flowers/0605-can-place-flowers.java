class Solution {
    public boolean canPlaceFlowers(int[] flowerbed, int n) {
        int result=0;
        if(flowerbed.length==1){
            if(flowerbed[0]==0){
                if(n==1){
                    return true;
                }
                if(n==0){
                    return true;
                }
                return n==0;
            }
            else return n==0;
        }
        if(flowerbed.length==2){
            if(flowerbed[0]==0&&flowerbed[1]==0){
                n-=1;
                return n==0;
            }
            else return n==0;
        }

        if(flowerbed[0]==0&&flowerbed[1]==0){
            flowerbed[0]=1;
            n-=1;
        }
        if(flowerbed[flowerbed.length-1]==0&&flowerbed[flowerbed.length-2]==0){
            flowerbed[flowerbed.length-1]=1;
            n-=1;
        }

        
        for (int i =1; i < flowerbed.length-1;i++){
            if(flowerbed[i]==0&&flowerbed[i-1]==0&&flowerbed[i+1]==0){
                flowerbed[i]=1;
                result+=1;
            }
        }

        if(result>=n) return true;
        else return false;
        
        
    }
}