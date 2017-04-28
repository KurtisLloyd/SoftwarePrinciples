using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;
using System.Windows.Controls;

namespace CommandPattern
{
    class UpCommand : ICommand
    {

        public UpCommand(Button target)
        {

        }
        public void Do()
        {
            
            throw new NotImplementedException();
        }

        public void UnDo()
        {
            throw new NotImplementedException();
        }
    }
}
