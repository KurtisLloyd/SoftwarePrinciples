using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace CommandPattern
{
    class DownCommand : ICommand
    {

        public DownCommand()
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
