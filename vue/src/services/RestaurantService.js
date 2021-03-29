import axios from "axios";

export default {
    searchByZip(category, zipCode) {
        const url = `/restaurants/${category}/${zipCode}`;
        return axios.get(url);
    },
    invite(inviteName, searchResults) {
        let payload = {restaurantNames: searchResults};
        return axios({
            method: 'post',
            url: `/invite/${inviteName}`,
            data: payload 
        })                
    }
}
